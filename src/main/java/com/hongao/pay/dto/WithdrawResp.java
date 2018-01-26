package com.hongao.pay.dto;

/**
 * 提现响应
 * @author iTeller_zc
 *
 */
public class WithdrawResp {
	
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
