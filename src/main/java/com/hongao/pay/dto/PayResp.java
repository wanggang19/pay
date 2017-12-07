package com.hongao.pay.dto;

import java.util.Map;

/**
 * 支付响应
 * @author iTeller_zc
 *
 * @date 2017年12月7日 上午10:01:31
 */
public class PayResp {
	
	/**
	 * 是否成功
	 */
	private boolean success;
	
	/**
	 * 响应数据
	 */
	private Object respData;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getRespData() {
		return respData;
	}

	public void setRespData(Object respData) {
		this.respData = respData;
	}
	
}
