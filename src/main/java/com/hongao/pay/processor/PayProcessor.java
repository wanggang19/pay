package com.hongao.pay.processor;

import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.dto.PayReq;
import com.hongao.pay.dto.PayResp;

/**
 * 支付处理器
 * @author iTeller_zc
 *
 * @date 2017年12月7日 上午10:15:10
 */
public abstract class PayProcessor {
	
	public abstract PayResp process(PayReq payReq) throws HaBizException;
}
