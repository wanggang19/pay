package com.hongao.pay.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.hongao.data.cond.QueryCond;
import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.cond.QueryWithdrawRecordCond;
import com.hongao.pay.dto.AuditWithdrawReq;
import com.hongao.pay.dto.OfflineMarkReq;
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
	
	/**
	 * 标记线下付款标志(目前微信)
	 * @param orderNo
	 * @throws HaBizException
	 */
	void markFlag(OfflineMarkReq offlineMarkReq) throws HaBizException;
	
	/**
	 * 根据主键查询提现记录
	 * @param id
	 * @return
	 */
	WithdrawRecord getById(Long id);

	/**  
	* 查询代理提现记录  
	* @param paramMap
	* @return 
	*/  
	List<WithdrawRecord> queryAgentWithdrawRecordList(Map<String, Object> paramMap);

	/**  
	* 查询代理提现记录总金额  
	* @param paramMap
	* @return 
	*/  
	BigDecimal queryAgentWithdrawRecordListNum(Map<String, Object> paramMap);
}
