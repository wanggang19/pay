package com.hongao.pay.service;

import java.util.List;

import com.hongao.data.cond.QueryCond;
import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.cond.QueryWithdrawRecordCond;
import com.hongao.pay.dto.AuditWithdrawReq;
import com.hongao.pay.dto.WithdrawReq;
import com.hongao.pay.dto.WithdrawResp;
import com.hongao.pay.model.WithdrawRecord;

/**
 * 提现服务
 * 
 * @author iTeller_zc
 *
 */
public interface WithdrawService {
	
	/**
	 * 发起提现(暂时需人工审核)
	 * @param withdrawReq
	 * @return
	 * @throws AppBizException
	 */
	WithdrawResp startWithdraw(WithdrawReq withdrawReq) throws HaBizException;
	
	/**
	 * 查询提现记录
	 * @param cond
	 * @return
	 */
	List<WithdrawRecord> queryWithdrawRecords(QueryCond<QueryWithdrawRecordCond> queryCond);
	
	/**
	 * 审核提现
	 * @param auditWithdrawReq
	 * @return
	 * @throws HaBizException
	 */
	WithdrawResp withdraw(AuditWithdrawReq auditWithdrawReq) throws HaBizException;
}
