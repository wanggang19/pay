package com.hongao.pay.dto;

/**
 * 审核提现请求
 * @author iTeller_zc
 *
 * @date 2018年1月26日 上午10:11:23
 */
public class AuditWithdrawReq {
	
	/**
	 * 主键
	 */
	private Long id;
	
	/**
	 * 状态
	 */
	private int status;
	
	/**
	 * 审核意见
	 */
	private String memo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
