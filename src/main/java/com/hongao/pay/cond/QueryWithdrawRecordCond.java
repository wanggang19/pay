package com.hongao.pay.cond;

import java.util.Date;

/**
 * 查询提现记录条件类
 * @author iTeller_zc
 *
 * @date 2018年1月26日 上午10:03:21
 */
public class QueryWithdrawRecordCond {
	
	/**
	 * 商户编号
	 */
	private String partyId;
	
	/**
	 * 账号类型
	 */
	private String acctType;
	
	/**
	 * 账号名称
	 */
	private String acctName;
	
	/**
	 * 账号
	 */
	private String acct;
	
	/**
	 * 状态
	 */
	private int status;
	
	/**
	 * 开始日期
	 */
	private Date startDate;
	
	/**
	 * 结束日期
	 */
	private Date endDate;

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
