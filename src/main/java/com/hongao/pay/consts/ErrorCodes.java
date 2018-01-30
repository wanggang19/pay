package com.hongao.pay.consts;

/**
 * 错误码
 * @author iTeller_zc
 *
 */
public class ErrorCodes {
	
	/**
	 * 支付系统异常
	 */
	public static final String SYS_ERROR = "pay.096";
	
	/**
	 * 不支持的支付类型
	 */
	public static final String NOT_SUPPORTED_PAY_TYPE = "pay.001";
	
	/**
	 * 提现记录未找到
	 */
	public static final String WITHDRAW_RECORD_NOT_FOUND = "pay.002";
	
	/**
	 * 提现状态异常
	 */
	public static final String WITHDRAW_RECORD_STATUS_NOT_SUPPORT = "pay.003";
	
	/**
	 * 不支持的标记类型
	 */
	public static final String NOT_SUPPORT_MARK_TYPE = "pay.004";
	
	private ErrorCodes(){
		
	}
}
