package com.hongao.pay.service;

import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.dto.PayReq;
import com.hongao.pay.dto.PayResp;
import com.hongao.pay.model.PayRecord;

/**
 * 支付服务
 * @author iTeller_zc
 *
 * @date 2017年12月7日 上午10:03:47
 */
public interface PayService {
	
	/**
	 * 发起支付  获取支付凭证
	 * @param payReq
	 * @return
	 * @throws HaBizException
	 */
	PayResp pay(PayReq payReq) throws HaBizException;
	
	/**
	 * 更新支付记录状态
	 * @param id
	 * @param status
	 * @throws HaBizException
	 */
	void updPayRecordStatus(Long id, int status) throws HaBizException;
	
	/**
	 * 根据主键获取支付记录
	 * @param id
	 * @return
	 */
	PayRecord getPayRecordById(Long id);
	
	/**
	 * 根据订单编号获取支付记录
	 * @param orderNo
	 * @return
	 */
	PayRecord getPayRecordByOrderNo(String orderNo);
}
