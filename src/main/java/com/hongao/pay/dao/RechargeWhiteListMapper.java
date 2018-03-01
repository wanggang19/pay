package com.hongao.pay.dao;

/**
 * 充值白名单dao
 * @author iTeller_zc
 *
 * @date 2018年3月1日 上午9:47:05
 */
public interface RechargeWhiteListMapper {
	
	/**
	 * 是否在白名单
	 * @param partyId
	 * @return
	 */
	int hit(String partyId);
}
