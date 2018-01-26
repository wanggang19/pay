package com.hongao.pay.dao;

import java.util.List;

import com.hongao.data.cond.QueryCond;
import com.hongao.pay.cond.QueryWithdrawRecordCond;
import com.hongao.pay.model.WithdrawRecord;

/**
 * 提现记录dao
 * @author iTeller_zc
 *
 * @date 2018年1月26日 上午9:57:02
 */
public interface WithdrawRecordMapper {

	/**
	 * 新增提现记录
	 * @param withdrawRecord
	 * @return
	 */
	int addWithdrawRecord(WithdrawRecord withdrawRecord);
	
	/**
	 * 修改提现记录状态
	 * @param id
	 * @param status
	 * @return
	 */
	int updWithdrawRecord(Long id, int status);
	
	/**
	 * 查询提现记录
	 * @param cond
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<WithdrawRecord> queryWithdrawRecordList(QueryWithdrawRecordCond cond, int offset, int limit);
}
