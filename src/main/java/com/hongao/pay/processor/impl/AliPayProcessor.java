package com.hongao.pay.processor.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.config.ali.AliPayConfig;
import com.hongao.pay.dao.PayRecordMapper;
import com.hongao.pay.dto.PayReq;
import com.hongao.pay.dto.PayResp;
import com.hongao.pay.model.PayRecord;
import com.hongao.pay.processor.PayProcessor;

/**
 * 支付宝支付
 * @author iTeller_zc
 *
 * @date 2017年12月7日 上午10:41:43
 */
public class AliPayProcessor extends PayProcessor{

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private PayRecordMapper payRecordMapper;
	
	@Override
	public PayResp process(PayReq payReq) throws HaBizException {
		AlipayClient alipayClient = new DefaultAlipayClient(AliPayConfig.URL, 
				AliPayConfig.APP_ID, 
				AliPayConfig.PRI_KEY, 
				AliPayConfig.FORMAT, 
				AliPayConfig.CHARSET,
				AliPayConfig.ALI_PUB_KEY, 
				AliPayConfig.SIGN_TYPE);
    	AlipayTradeWapPayRequest alipayRequest = new AlipayTradeWapPayRequest();
		alipayRequest.setReturnUrl(payReq.getFrontUrl());
    	alipayRequest.setNotifyUrl(payReq.getNotifyUrl());
    
    	AlipayTradeWapPayModel alipayTradeWapPayModel = new AlipayTradeWapPayModel();
    	//订单编号
    	alipayTradeWapPayModel.setOutTradeNo(payReq.getOrderNo());
    	//主题
        alipayTradeWapPayModel.setSubject(payReq.getOrderName());
        //金额
        alipayTradeWapPayModel.setTotalAmount(String.valueOf(payReq.getAmt()));
        //虚拟商品
        alipayTradeWapPayModel.setGoodsType(String.valueOf(0));
        //可用渠道
        alipayTradeWapPayModel.setEnablePayChannels("pcredit,moneyFund,debitCardExpress");
        //签约产品码
        alipayTradeWapPayModel.setProductCode(AliPayConfig.PROD_CODE);
        
        //填充业务参数
        alipayRequest.setBizModel(alipayTradeWapPayModel);
        PayResp payResp = new PayResp();
        try {
	    	//调用SDK生成表单
        	logger.info("alipay req:{} .", JSONObject.toJSONString(alipayRequest));
        	String form = alipayClient.pageExecute(alipayRequest).getBody();
        	logger.info("alipay resp:{} .", form);
        	payResp.setSuccess(true);
        	payResp.setRespData(form);
        	
        	PayRecord payRecord = payRecordMapper.getPayRecordByOrderNo(payReq.getOrderNo());
			payRecordMapper.updPayRecordRespData(payRecord.getId(), form);
			
		} catch (AlipayApiException e) {
			logger.error("call alipay meet error!", e);
		}
        
        return payResp;
	}

}
