package com.hongao.pay.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hongao.pay.dao.RechargeWhiteListMapper;
import com.hongao.pay.service.RechargeWhiteListService;

/**
 * 
 * @author iTeller_zc
 *
 * @date 2018年3月1日 上午9:44:42
 */
@Service
public class RechargeWhiteListServiceImpl implements RechargeWhiteListService{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private RechargeWhiteListMapper rechargeWhiteListMapper;
	
	@Override
	public boolean hit(String partyId) {
		int hitCount = rechargeWhiteListMapper.hit(partyId);
		if(hitCount > 0){
			logger.info("partyId={} in recharge white list!", partyId);
		}
		return  hitCount > 0;
	}

}
