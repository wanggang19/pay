package com.hongao.pay.dto;

import javax.validation.constraints.NotNull;

/**
 * 线下标记请求
 * @author iTeller_zc
 *
 * @date 2018年1月30日 上午10:21:56
 */
public class OfflineMarkReq {
	/**
	 * 主键
	 */
	@NotNull
	private Long id;
	
	/**
	 * 标记备注
	 */
	private String memo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
