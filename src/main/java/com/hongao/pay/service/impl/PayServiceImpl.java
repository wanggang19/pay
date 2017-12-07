package com.hongao.pay.service.impl;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.consts.ErrorCodes;
import com.hongao.pay.dao.PayRecordMapper;
import com.hongao.pay.dto.PayReq;
import com.hongao.pay.dto.PayResp;
import com.hongao.pay.model.PayRecord;
import com.hongao.pay.processor.PayProcessor;
import com.hongao.pay.service.PayService;
import com.hongao.utils.bean.BeanUtilsExt;

public class PayServiceImpl implements PayService {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	private Map<String, PayProcessor> payProcessors;
	
	public void setPayProcessors(Map<String, PayProcessor> payProcessors) {
		this.payProcessors = payProcessors;
	}

	@Autowired
	private PayRecordMapper payRecordMapper; 
	
	@Override
	@Transactional
	public PayResp pay(PayReq payReq) throws HaBizException {
		logger.info("pay req:{} .", payReq);
		PayProcessor payProcessor = payProcessors.get(payReq.getPayType());
		if(payProcessor == null){
			logger.error("not supported pay type={}!", payReq.getPayType());
			throw new HaBizException(ErrorCodes.NOT_SUPPORTED_PAY_TYPE, "not supported pay type!");
		}
		
		PayRecord payRecord = new PayRecord();
		
		try {
			BeanUtilsExt.copyProperties(payRecord, payReq);
		} catch (Exception e) {
			logger.error("bean copy meet error!", e);
			throw new HaBizException(ErrorCodes.SYS_ERROR, "bean copy meet error!");
		}
			
		payRecordMapper.addPayRecord(payRecord);
		
		return payProcessor.process(payReq);
	}

	@Override
	public void updPayRecordStatus(Long id, int status) throws HaBizException {
	}

	@Override
	public PayRecord getPayRecordById(Long id) {
	
		return null;
	}

	@Override
	public PayRecord getPayRecordByOrderNo(String orderNo) {
		
		return null;
	}

}
