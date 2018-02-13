package com.hongao.pay.dto;

import java.math.BigDecimal;
import java.util.Date;

 /** 
 * TODO
 * @author: eadela
 * @date: 2018年2月12日 上午10:17:20  
 */
public class WithdrawAuditResp {
	
	/**
	 * 主键
	 */
	private Long id;
	
	/**
	 * 订单编号
	 */
	private String orderNo;
	
	/**
	 * partyId
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
	
	/**
	 * 审核备注
	 */
	private String memo;
	
	/** balance*/
	private BigDecimal balance;
	
	/** delayAmt*/
	private BigDecimal delayAmt;

	private String mobile;
	
	private String realName;
	
	private Long invitationCode;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the partyId
	 */
	public String getPartyId() {
		return partyId;
	}

	/**
	 * @param partyId the partyId to set
	 */
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	/**
	 * @return the acctName
	 */
	public String getAcctName() {
		return acctName;
	}

	/**
	 * @param acctName the acctName to set
	 */
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	/**
	 * @return the acct
	 */
	public String getAcct() {
		return acct;
	}

	/**
	 * @param acct the acct to set
	 */
	public void setAcct(String acct) {
		this.acct = acct;
	}

	/**
	 * @return the acctType
	 */
	public int getAcctType() {
		return acctType;
	}

	/**
	 * @param acctType the acctType to set
	 */
	public void setAcctType(int acctType) {
		this.acctType = acctType;
	}

	/**
	 * @return the amt
	 */
	public BigDecimal getAmt() {
		return amt;
	}

	/**
	 * @param amt the amt to set
	 */
	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	/**
	 * @return the feeRate
	 */
	public BigDecimal getFeeRate() {
		return feeRate;
	}

	/**
	 * @param feeRate the feeRate to set
	 */
	public void setFeeRate(BigDecimal feeRate) {
		this.feeRate = feeRate;
	}

	/**
	 * @return the srvFee
	 */
	public BigDecimal getSrvFee() {
		return srvFee;
	}

	/**
	 * @param srvFee the srvFee to set
	 */
	public void setSrvFee(BigDecimal srvFee) {
		this.srvFee = srvFee;
	}

	/**
	 * @return the acAmt
	 */
	public BigDecimal getAcAmt() {
		return acAmt;
	}

	/**
	 * @param acAmt the acAmt to set
	 */
	public void setAcAmt(BigDecimal acAmt) {
		this.acAmt = acAmt;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the crtTime
	 */
	public Date getCrtTime() {
		return crtTime;
	}

	/**
	 * @param crtTime the crtTime to set
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}

	/**
	 * @return the updTime
	 */
	public Date getUpdTime() {
		return updTime;
	}

	/**
	 * @param updTime the updTime to set
	 */
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}

	/**
	 * @return the respData
	 */
	public String getRespData() {
		return respData;
	}

	/**
	 * @param respData the respData to set
	 */
	public void setRespData(String respData) {
		this.respData = respData;
	}

	/**
	 * @return the memo
	 */
	public String getMemo() {
		return memo;
	}

	/**
	 * @param memo the memo to set
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}

	/**
	 * @return the balance
	 */
	public BigDecimal getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	/**
	 * @return the delayAmt
	 */
	public BigDecimal getDelayAmt() {
		return delayAmt;
	}

	/**
	 * @param delayAmt the delayAmt to set
	 */
	public void setDelayAmt(BigDecimal delayAmt) {
		this.delayAmt = delayAmt;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * @return the invitationCode
	 */
	public Long getInvitationCode() {
		return invitationCode;
	}

	/**
	 * @param invitationCode the invitationCode to set
	 */
	public void setInvitationCode(Long invitationCode) {
		this.invitationCode = invitationCode;
	}
	
}
