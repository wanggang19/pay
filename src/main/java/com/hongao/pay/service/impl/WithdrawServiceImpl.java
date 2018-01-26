package com.hongao.pay.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hongao.data.cond.QueryCond;
import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.cond.QueryWithdrawRecordCond;
import com.hongao.pay.dto.AuditWithdrawReq;
import com.hongao.pay.dto.WithdrawReq;
import com.hongao.pay.dto.WithdrawResp;
import com.hongao.pay.model.WithdrawRecord;
import com.hongao.pay.service.WithdrawService;

/**
 * 提现服务实现
 * @author iTeller_zc
 *
 * @date 2018年1月26日 上午9:55:49
 */
public class WithdrawServiceImpl implements WithdrawService {

	@Override
	@Transactional
	public WithdrawResp startWithdraw(WithdrawReq withdrawReq) throws HaBizException {
		return null;
	}

	@Override
	public List<WithdrawRecord> queryWithdrawRecords(QueryCond<QueryWithdrawRecordCond> queryCond) {
		return null;
	}

	@Override
	public WithdrawResp withdraw(AuditWithdrawReq auditWithdrawReq) throws HaBizException {
		return null;
	}

}
