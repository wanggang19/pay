package com.hongao.pay.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 提现记录
 * @author iTeller_zc
 *
 * @date 2018年1月26日 上午9:44:22
 */
public class WithdrawRecord {
	
	/**
	 * 主键
	 */
	private Long id;
	
	/**
	 * 订单编号
	 */
	private String orderNo;
	
	/**
	 * uid
	 */
	private String partyId;
	
	/**
	 * 账户名称
	 */
	private String acctName;
	
	/**
	 * 账号
	 */
	private String acct;
	
	/**
	 * 账号类型
	 */
	private int acctType;
	
	/**
	 * 提现金额
	 */
	private BigDecimal amt;
	
	/**
	 * 费率
	 */
	private BigDecimal feeRate;
	
	/**
	 * 固定服务费
	 */
	private BigDecimal srvFee;
	
	/**
	 * 到账金额
	 */
	private BigDecimal acAmt;
	
	/**
	 * 状态
	 */
	private int status;
	
	/**
	 * 创建时间
	 */
	private Date crtTime;
	
	/**
	 * 更新时间
	 */
	private Date updTime;
	
	/**
	 * 第三方响应数据
	 */
	private String respData;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAcct() {
		return acct;
	}

	public void setAcct(String acct) {
		this.acct = acct;
	}

	public int getAcctType() {
		return acctType;
	}

	public void setAcctType(int acctType) {
		this.acctType = acctType;
	}

	public BigDecimal getAmt() {
		return amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public BigDecimal getFeeRate() {
		return feeRate;
	}

	public void setFeeRate(BigDecimal feeRate) {
		this.feeRate = feeRate;
	}

	public BigDecimal getSrvFee() {
		return srvFee;
	}

	public void setSrvFee(BigDecimal srvFee) {
		this.srvFee = srvFee;
	}

	public BigDecimal getAcAmt() {
		return acAmt;
	}

	public void setAcAmt(BigDecimal acAmt) {
		this.acAmt = acAmt;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCrtTime() {
		return crtTime;
	}

	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}

	public Date getUpdTime() {
		return updTime;
	}

	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}

	public String getRespData() {
		return respData;
	}

	public void setRespData(String respData) {
		this.respData = respData;
	}

}
