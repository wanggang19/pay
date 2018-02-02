package com.hongao.pay.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
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
	 * 查询提现记录
	 * @param cond
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<WithdrawRecord> queryWithdrawRecordList(@Param(value="cond") QueryWithdrawRecordCond cond, @Param(value="offset") int offset, @Param(value="limit") int limit);

	/**
	 * 根据主键获取提现记录
	 * @param id
	 * @return 
	 */
	WithdrawRecord getById(Long id);
	
	/**
	 * 修改提现记录(状态 备注)
	 * @param withdrawRecord
	 * @return
	 */
	int updWithdrawRecord(WithdrawRecord withdrawRecord);

	/**
	 * 根据主键锁定记录
	 * @param id
	 * @return
	 */
	WithdrawRecord getByIdForUpdate(Long id);

	/**
	 * 根据订单编号获取
	 * @param orderNo
	 * @return
	 */
	WithdrawRecord getByOrderNoForUpdate(String orderNo);

	/**  
	* 查询代练提现记录 
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
