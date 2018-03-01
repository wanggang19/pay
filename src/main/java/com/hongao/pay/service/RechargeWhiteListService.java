package com.hongao.pay.service;

/**
 * 充值白名单服务
 * @author iTeller_zc
 *
 * @date 2018年3月1日 上午9:42:58
 */
public interface RechargeWhiteListService {
	
	/**
	 * 是否在白名单列表中
	 * @param partyId
	 * @return
	 */
	boolean hit(String partyId);
}
