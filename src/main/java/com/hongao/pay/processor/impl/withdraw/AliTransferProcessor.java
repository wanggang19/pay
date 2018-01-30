package com.hongao.pay.processor.impl.withdraw;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.config.ali.AliPayConfig;
import com.hongao.pay.dao.WithdrawRecordMapper;
import com.hongao.pay.dto.WithdrawResp;
import com.hongao.pay.model.WithdrawRecord;
import com.hongao.pay.processor.WithdrawProcessor;

/**
 * 支付宝转账处理器
 * @author iTeller_zc
 *
 * @date 2018年1月29日 下午4:40:32
 */
public class AliTransferProcessor extends WithdrawProcessor{

	@Autowired
	private WithdrawRecordMapper withdrawRecordMapper;
	
	@Override
	public WithdrawResp withdraw(Long withdrawId) throws HaBizException {
		WithdrawResp withdrawResp = new WithdrawResp();
		WithdrawRecord withdrawRecord = withdrawRecordMapper.getById(withdrawId);
		AlipayClient alipayClient = new DefaultAlipayClient(AliPayConfig.URL, AliPayConfig.APP_ID, AliPayConfig.PRI_KEY, "json", "UTF-8", AliPayConfig.ALI_PUB_KEY, "RSA2");
		AlipayFundTransToaccountTransferRequest alipayFundTransToaccountTransferRequest = new AlipayFundTransToaccountTransferRequest();
		Map<String, String> params = new HashMap<String, String>();
		//业务编号
		params.put("out_biz_no", withdrawRecord.getOrderNo());
		//收款账号 用户名/邮箱
		params.put("payee_type", "ALIPAY_LOGONID");
		//收款账号
		params.put("payee_account", withdrawRecord.getAcct());
		//收款方实名
		params.put("payee_real_name", withdrawRecord.getAcctName());
		//转账金额(提现记录为支出 记录为负值)
		params.put("amount", String.valueOf(withdrawRecord.getAcAmt().abs()));
		//付款方名称
		params.put("payer_show_name", AliPayConfig.PAYER_NAME);
		params.put("remark", AliPayConfig.REMARK);
		String bizContent = JSONObject.toJSONString(params);
		alipayFundTransToaccountTransferRequest.setBizContent(bizContent);
		try {
			AlipayFundTransToaccountTransferResponse resp = alipayClient.execute(alipayFundTransToaccountTransferRequest);
			if(resp.getCode().equals(AliPayConfig.TRANSFER_SUCCESS)){
				logger.info("ali transfer success, amt={}, acct={}!", withdrawRecord.getAcAmt().abs(), withdrawRecord.getAcct());
				withdrawResp.setSuccess(Boolean.TRUE);
			}else{
				logger.error("ali transfer failed, code={}, msg={}!", resp.getCode(), resp.getMsg());
			}
			withdrawResp.setRespData(JSONObject.toJSONString(resp));
		} catch (AlipayApiException e) {
			logger.error("call ali transfer failed!");
			e.printStackTrace();
		}
		return withdrawResp;
	}
	
}
