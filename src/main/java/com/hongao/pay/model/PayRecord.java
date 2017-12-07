package com.hongao.pay.model;

import java.util.Date;

/**
 * 支付记录
 * @author iTeller_zc
 *
 * @date 2017年12月7日 上午9:49:07
 */
public class PayRecord {
	
	/**
	 * 主键
	 */
	private Long id;
	
	/**
	 * 用户编号
	 */
	private Long userId;
	
	/**
	 * 商户编号
	 */
	private String partyId;
	
	/**
	 * 订单编号
	 */
	private String orderNo;
	
	/**
	 * 支付金额
	 */
	private float amt;
	
	/**
	 * 支付方式
	 */
	private String payType;
	
	/**
	 * 订单名称
	 */
	private String orderName;
	
	/**
	 * 订单详情
	 */
	private String orderDetail;
	
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
	 * 响应数据
	 */
	private String respData;
	
	/**
	 * 扩展属性
	 */
	private String extProps;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public float getAmt() {
		return amt;
	}

	public void setAmt(float amt) {
		this.amt = amt;
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

	public String getExtProps() {
		return extProps;
	}

	public void setExtProps(String extProps) {
		this.extProps = extProps;
	}
	
}
