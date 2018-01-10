package com.hongao.pay.dao;

import org.apache.ibatis.annotations.Param;

import com.hongao.pay.model.PayRecord;

/**
 * 支付记录  DAO
 * @author iTeller_zc
 *
 */
public interface PayRecordMapper {
	
	/**
	 * 新增支付记录
	 * @param payRecord
	 */
	void addPayRecord(PayRecord payRecord);
	
	/**
	 * 更新充值记录
	 * @param id
	 * @param status
	 * @return
	 */
	int updPayRecordStatus(@Param(value="id") Long id, @Param(value="status") int status);
	
	/**
	 * 更新充值记录状态
	 * @param id
	 * @param status
	 * @return
	 */
	int updPayRecordStatusByOrderNo(@Param(value="orderNo") String orderNo, @Param(value="status") int status);

	/**
	 * 根据主键获取充值记录
	 * @param id
	 * @return
	 */
	PayRecord getPayRecordById(Long id);
	
	/**
	 * 根据订单编号获取充值记录
	 * @param orderNo
	 * @return
	 */		  
	PayRecord getPayRecordByOrderNo(@Param(value="orderNo")String orderNo);

	/**
	 * 更新支付记录响应数据
	 * @param id
	 * @param respData
	 */
	void updPayRecordRespData(@Param(value="id")Long id, @Param(value="respData") String respData);
}
