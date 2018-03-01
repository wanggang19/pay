package com.hongao.pay.game.whitelist;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hongao.consts.party.PartyIds;
import com.hongao.pay.game.HaGamePayBaseTest;
import com.hongao.pay.service.RechargeWhiteListService;

/**
 * 
 * @author iTeller_zc
 *
 * @date 2018年3月1日 上午10:05:57
 */
public class TestRechargeWhiteListService extends HaGamePayBaseTest{
	
	@Autowired
	private RechargeWhiteListService rechargeWhiteListService;
	
	@Test
	public void testHit(){
		System.out.println(rechargeWhiteListService.hit(PartyIds.HA));
	}
}
