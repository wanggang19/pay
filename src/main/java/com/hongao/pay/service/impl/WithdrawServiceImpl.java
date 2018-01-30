package com.hongao.pay.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.alibaba.fastjson.JSONObject;
import com.hongao.cif.model.agreement.WithdrawAgreement;
import com.hongao.cif.service.AgreementService;
import com.hongao.consts.third.ThirdPayAcctTypes;
import com.hongao.consts.withdraw.WithdrawStatuses;
import com.hongao.data.cond.QueryCond;
import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.cond.QueryWithdrawRecordCond;
import com.hongao.pay.consts.ErrorCodes;
import com.hongao.pay.dao.WithdrawRecordMapper;
import com.hongao.pay.dto.AuditWithdrawReq;
import com.hongao.pay.dto.OfflineMarkReq;
import com.hongao.pay.dto.WithdrawReq;
import com.hongao.pay.dto.WithdrawResp;
import com.hongao.pay.model.WithdrawRecord;
import com.hongao.pay.processor.WithdrawProcessor;
import com.hongao.pay.service.WithdrawService;

/**
 * 提现服务实现
 * @author iTeller_zc
 *
 * @date 2018年1月26日 上午9:55:49
 */
public class WithdrawServiceImpl implements WithdrawService {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private WithdrawRecordMapper withdrawRecordMapper;
	
	@Autowired
	private AgreementService agreementService;
	
	private Map<String, WithdrawProcessor>  withdrawProcessors;
	
	public void setWithdrawProcessors(Map<String, WithdrawProcessor> withdrawProcessors) {
		this.withdrawProcessors = withdrawProcessors;
	}

	@Override
	@Transactional
	public WithdrawResp startWithdraw(WithdrawReq withdrawReq) throws HaBizException {
		logger.info("withdraw req:{} .", JSONObject.toJSONString(withdrawReq));
		WithdrawResp withdrawResp = new WithdrawResp();
		//规则 TODO 默认都需人工审核(放到ha-common rule模块)
		WithdrawRecord withdrawRecord = new WithdrawRecord();
		withdrawRecord.setStatus(WithdrawStatuses.START);
		withdrawRecord.setAcct(withdrawReq.getAcct());
		withdrawRecord.setAcctName(withdrawReq.getAcctName());
		withdrawRecord.setAcctType(withdrawReq.getAcctType());
		String partyId = withdrawReq.getPartyId();
		BigDecimal amt = withdrawReq.getAmt();
		WithdrawAgreement withdrawAgreement = agreementService.getWithdrawAgreement(partyId).getT();
		BigDecimal acAmt = cal(amt, withdrawAgreement);
		withdrawRecord.setAcAmt(acAmt);
		withdrawRecord.setAmt(BigDecimal.ZERO.subtract(withdrawReq.getAmt()));
		withdrawRecord.setCrtTime(new Date());
		withdrawRecord.setFeeRate(withdrawAgreement.getRate());
		withdrawRecord.setOrderNo(withdrawReq.getOrderNo());
		withdrawRecord.setPartyId(withdrawReq.getPartyId());
		withdrawRecord.setSrvFee(withdrawAgreement.getFixSrvFee());
		withdrawResp.setSuccess(Boolean.TRUE);
		withdrawRecordMapper.addWithdrawRecord(withdrawRecord);
		logger.info("withdraw record create successfully, id={}.", withdrawRecord.getId());
		return withdrawResp;
	}

	private BigDecimal cal(BigDecimal amt, WithdrawAgreement withdrawAgreement) {
		BigDecimal acAmt = amt.multiply(new BigDecimal(1).subtract(withdrawAgreement.getRate())).subtract(withdrawAgreement.getFixSrvFee());
		return BigDecimal.ZERO.subtract(acAmt);
	}

	@Override
	public List<WithdrawRecord> queryWithdrawRecords(QueryCond<QueryWithdrawRecordCond> queryCond) {
		return withdrawRecordMapper.queryWithdrawRecordList(queryCond.getCond(), queryCond.getOffset(), queryCond.getLimit());
	}

	@Override
	public WithdrawResp withdraw(AuditWithdrawReq auditWithdrawReq) throws HaBizException {
		WithdrawResp withdrawResp = new WithdrawResp();
		if(WithdrawStatuses.isLegalAuditStatus(auditWithdrawReq.getStatus())){
			logger.error("withdraw status:{} not support!", auditWithdrawReq.getStatus());
		}
		WithdrawRecord withdrawRecord = withdrawRecordMapper.getByIdForUpdate(auditWithdrawReq.getId());
		if(withdrawRecord == null){
			logger.error("not found withdraw record, id={}!", auditWithdrawReq.getId());
			throw new HaBizException(ErrorCodes.WITHDRAW_RECORD_NOT_FOUND, "not found withdraw record!");
		}
		if(!WithdrawStatuses.isPayStatus(withdrawRecord.getStatus())){
			logger.error("withdraw record status:{} not support,id={}.", withdrawRecord.getStatus(), withdrawRecord.getId());
			throw new HaBizException(ErrorCodes.WITHDRAW_RECORD_STATUS_NOT_SUPPORT, "withdraw record status not support!");
		}
		withdrawRecord.setStatus(auditWithdrawReq.getStatus());
		withdrawRecord.setMemo(auditWithdrawReq.getMemo());
		if(auditWithdrawReq.getStatus() == WithdrawStatuses.REJECT){
			int result = withdrawRecordMapper.updWithdrawRecord(withdrawRecord);
			if(result == 1){
				logger.info("reject successfully, id={}.", withdrawRecord.getId());
				withdrawResp.setSuccess(Boolean.TRUE);
			}else{
				logger.info("reject failed, id={}.", withdrawRecord.getId());
				withdrawResp.setSuccess(Boolean.FALSE);
			}
		}else if(auditWithdrawReq.getStatus() == WithdrawStatuses.PASS){
			//目前仅支持支付宝打款
			WithdrawProcessor withdrawProcessor = withdrawProcessors.get(String.valueOf(withdrawRecord.getAcctType()));
			if(withdrawProcessor == null){
				logger.error("not support withdraw type:{}!", withdrawRecord.getAcctType());
				throw new HaBizException(ErrorCodes.SYS_ERROR, "not supported withdraw type!");
			}
			withdrawResp = withdrawProcessor.withdraw(withdrawRecord.getId());
			if(withdrawResp.isSuccess()){
				withdrawRecord.setStatus(WithdrawStatuses.SUCCESS);
			}
		}
		withdrawRecordMapper.updWithdrawRecord(withdrawRecord);
		logger.info("withdraw record status upd successfully, id={}, status={}!", 
				withdrawRecord.getId(), withdrawRecord.getStatus());
		return withdrawResp;
	}

	@Override
	public void markFlag(OfflineMarkReq offlineMarkReq) throws HaBizException {
		WithdrawRecord withdrawRecord = withdrawRecordMapper.getByIdForUpdate(offlineMarkReq.getId());
		if(withdrawRecord == null){
			logger.error("not found withdraw record, id={}!", offlineMarkReq.getId());
			throw new HaBizException(ErrorCodes.WITHDRAW_RECORD_NOT_FOUND, "not found withdraw record!");
		}
		if(withdrawRecord.getAcctType() != ThirdPayAcctTypes.WX){
			logger.error("not support mark type:{}.", withdrawRecord.getAcctType());
			throw new HaBizException(ErrorCodes.NOT_SUPPORT_MARK_TYPE, "not support mark type!");
		}
		if(withdrawRecord.getStatus() != WithdrawStatuses.SUCCESS){
			logger.error("withdraw record status:{} not support,id={}.", withdrawRecord.getStatus(), withdrawRecord.getId());
			throw new HaBizException(ErrorCodes.WITHDRAW_RECORD_STATUS_NOT_SUPPORT, "withdraw record status not support!");
		}
		
		withdrawRecord.setStatus(WithdrawStatuses.MARK_SUCCESS);
		withdrawRecord.setMemo(offlineMarkReq.getMemo());
		withdrawRecordMapper.updWithdrawRecord(withdrawRecord);
	}

	@Override
	public WithdrawRecord getById(Long id) {
		return withdrawRecordMapper.getById(id);
	}

}
