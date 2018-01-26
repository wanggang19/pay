package com.hongao.pay.dto;

/**
 * 审核提现响应
 * @author iTeller_zc
 *
 * @date 2018年1月26日 上午10:11:23
 */
public class AuditWithdrawResp {
	
	/**
	 * 是否成功
	 */
	private boolean success;
	
	/**
	 * 错误码
	 */
	private String errorCode;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}
