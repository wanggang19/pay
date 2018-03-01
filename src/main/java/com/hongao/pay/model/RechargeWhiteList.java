package com.hongao.pay.model;

import java.util.Date;

/**
 * 充值白名单
 * @author iTeller_zc
 *
 * @date 2018年3月1日 上午9:41:37
 */
public class RechargeWhiteList {
	
	/**
	 * 商户编号
	 */
	private String partyId;
	
	/**
	 * 状态  1 有效 2 失效
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

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
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
	
}
