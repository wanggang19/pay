package com.hongao.pay.dto;

import java.math.BigDecimal;

/**
 * 提现请求
 * @author iTeller_zc
 *
 */
public class WithdrawReq {
	
	/**
	 * 商户编号
	 */
	private String partyId;
	
	/**
	 * 订单编号
	 */
	private String orderNo;
	
	/**
	 * 提现金额
	 */
	private BigDecimal amt;
	
	/**
	 * 账号类型
	 */
	private int acctType;
	
	/**
	 * 提现账户
	 */
	private String acct;
	
	/**
	 * 账号名称
	 */
	private String acctName;
	
	/**
	 * 口令
	 */
	private String token;
	
	/**
	 * 提现密码
	 */
	private String withdrawPwd;

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public int getAcctType() {
		return acctType;
	}

	public void setAcctType(int acctType) {
		this.acctType = acctType;
	}

	public String getAcct() {
		return acct;
	}

	public void setAcct(String acct) {
		this.acct = acct;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getWithdrawPwd() {
		return withdrawPwd;
	}

	public void setWithdrawPwd(String withdrawPwd) {
		this.withdrawPwd = withdrawPwd;
	}

}
