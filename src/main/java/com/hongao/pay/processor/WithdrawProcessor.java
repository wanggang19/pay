package com.hongao.pay.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.dto.WithdrawResp;

/**
 * 提现处理器
 * @author iTeller_zc
 *
 * @date 2018年1月29日 下午4:37:40
 */
public abstract class WithdrawProcessor {
	
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
	 * 提现处理
	 * @return
	 * @throws HaBizException
	 */
	public abstract WithdrawResp withdraw(Long withdrawId) throws HaBizException;
}
