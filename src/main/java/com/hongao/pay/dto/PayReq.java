package com.hongao.pay.dto;

import javax.validation.constraints.NotNull;

/**
 * 支付请求
 * @author iTeller_zc
 *
 * @date 2017年12月7日 上午9:46:41
 */
public class PayReq {
	
	/**
	 * 用户Id
	 */
	@NotNull
	private Long userId;
	
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
	 * 支付金额
	 */
	@NotNull
	private Float amt;
	
	/**
	 * 前端通知url
	 */
	@NotNull
	private String frontUrl;
	
	/**
	 * 异步通知url
	 */
	@NotNull
	private String notifyUrl;
	
	/**
	 * 支付方式
	 */
	@NotNull
	private String payType;
	
	/**
	 * 订单名称
	 */
	@NotNull
	private String orderName;
	
	/**
	 * 订单详情
	 */
	@NotNull
	private String orderDetail;
	
	/**
	 * 登陆微信号openid
	 */
	private String openid;
	
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Float getAmt() {
		return amt;
	}

	public void setAmt(Float amt) {
		this.amt = amt;
	}

	public String getFrontUrl() {
		return frontUrl;
	}

	public void setFrontUrl(String frontUrl) {
		this.frontUrl = frontUrl;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}
}
