package com.hongao.pay.processor.impl.withdraw;

import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.dto.WithdrawResp;
import com.hongao.pay.processor.WithdrawProcessor;

/**
 * 微信转账处理器(目前走线下,线上做登记)
 * @author iTeller_zc
 *
 * @date 2018年1月30日 上午10:39:12
 */
public class WxTransferProcessor extends WithdrawProcessor{

	@Override
	public WithdrawResp withdraw(Long withdrawId) throws HaBizException {
		WithdrawResp withdrawResp = new WithdrawResp();
		withdrawResp.setSuccess(true);
		return withdrawResp;
	}

}
