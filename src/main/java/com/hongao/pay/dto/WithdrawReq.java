package com.hongao.pay.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

/**
 * 提现请求
 * @author iTeller_zc
 *
 */
public class WithdrawReq {
	
	/**
	 * 商户编号
	 */
	@NotNull
	private String partyId;
	
	/**
	 * 订单编号
	 */
	@NotNull
	private String orderNo;
	
	/**
	 * 提现金额
	 */
	@NotNull
	private BigDecimal amt;
	
	/**
	 * 账号类型
	 */
	@NotNull
	private int acctType;
	
	/**
	 * 提现账户
	 */
	@NotNull
	private String acct;
	
	/**
	 * 账号名称
	 */
	@NotNull
	private String acctName;
	
	/**
	 * 口令
	 */
	@NotNull
	private String token;

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
}
