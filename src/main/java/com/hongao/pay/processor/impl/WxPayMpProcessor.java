package com.hongao.pay.processor.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.time.FastDateFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.alibaba.fastjson.JSONObject;
import com.hongao.consts.ratio.VRates;
import com.hongao.parent.exception.HaBizException;
import com.hongao.pay.config.wx.IPayConfig;
import com.hongao.pay.config.wx.IPayConsts;
import com.hongao.pay.config.wx.TransactionCodes;
import com.hongao.pay.dao.PayRecordMapper;
import com.hongao.pay.dto.PayReq;
import com.hongao.pay.dto.PayResp;
import com.hongao.pay.model.PayRecord;
import com.hongao.pay.processor.PayProcessor;
import com.hongao.pay.utils.FormDateReportConvertor;
import com.hongao.pay.utils.HttpClientUtil;
import com.hongao.pay.utils.MD5Facade;

/**
 * 微信公众号支付处理器
 * @author eadela
 * @date 2017年12月7日 上午10:23:33
 */
public class WxPayMpProcessor extends PayProcessor{
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private PayRecordMapper payRecordMapper;
	
	@Override
	@Transactional
	public PayResp process(PayReq payReq) throws HaBizException {
		
		String funcode = TransactionCodes.PAY;
		String version = IPayConsts.VERSION;
		String appId = IPayConfig.MP_APP_ID;
		String mhtOrderNo = payReq.getOrderNo();
		String mhtOrderName = payReq.getOrderName();
		String mhtOrderType = IPayConsts.ORDER_TYPE;
		String mhtCurrencyType = IPayConsts.CURRENCY_TYPE;
		String mhtOrderAmt = String.valueOf((int) (payReq.getAmt()*IPayConsts.RMB_RATE));
		String mhtOrderDetail = payReq.getOrderDetail();
		FastDateFormat dateFormat = FastDateFormat.getInstance("yyyyMMddHHmmss");
		String mhtOrderStartTime = dateFormat.format(new Date());
		String frontNotifyUrl = payReq.getFrontUrl();
		String notifyUrl = payReq.getNotifyUrl();
		String mhtCharset = "UTF-8";
		String deviceType = IPayConsts.MP_DEVICE_TYPE;
		String payChannelType = IPayConsts.WECHAT_CHANNEL;
		String outputType = IPayConsts.MP_OUT_PUT_TYPE;//
		String mhtSubAppId = IPayConfig.MP_APPID;
		String consumerId = payReq.getOpenid();
		String appKey = IPayConfig.MP_MD5_KEY;
		String mhtSignType = "MD5";

		// 做MD5签名
		Map<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("appId", appId);//商户应用标识
		dataMap.put("deviceType", deviceType);//设备类型
		dataMap.put("funcode", funcode);//功能码
		dataMap.put("mhtOrderNo", mhtOrderNo);//订单编号
		dataMap.put("mhtOrderName", mhtOrderName);//商品名称
		dataMap.put("version", version);//版本
		dataMap.put("mhtCurrencyType", mhtCurrencyType);//币种
		dataMap.put("mhtOrderAmt", mhtOrderAmt);//订单金额
		dataMap.put("mhtOrderDetail", mhtOrderDetail);//订单详情
		dataMap.put("mhtOrderType", mhtOrderType);//订单类型
		dataMap.put("mhtOrderStartTime", mhtOrderStartTime);//开始时间
		dataMap.put("notifyUrl", notifyUrl);//异步通知url
		dataMap.put("frontNotifyUrl", frontNotifyUrl);//前台通知url
		dataMap.put("mhtCharset", mhtCharset);//字符编码
		dataMap.put("outputType", outputType);//输出格式
		dataMap.put("mhtSubAppId", mhtSubAppId);//商户appId
		dataMap.put("consumerId", consumerId);//消费者ID
		dataMap.put("payChannelType", payChannelType);//渠道类型
		dataMap.put("mhtSignType", mhtSignType);//签名方法
		dataMap.put("mhtLimitPay", "0");//禁用信用卡

		String mhtSignature = MD5Facade.getFormDataParamMD5(dataMap, appKey, mhtCharset);

		dataMap.put("mhtSignature", mhtSignature);
		String reqParams = FormDateReportConvertor.postFormLinkReportWithURLEncode(dataMap, mhtCharset);
		
		PayResp payResp = new PayResp();
		try {
			logger.info("ipay req:{} .", JSONObject.toJSONString(reqParams));
			String respParams = HttpClientUtil.sendSSLHttp(IPayConfig.IPAY_URL, reqParams, mhtCharset);
			Map<String, String> respData = FormDateReportConvertor.parseFormDataPatternReportWithDecode(respParams,
					mhtCharset, mhtCharset);
			logger.info("ipay result:{}", JSONObject.toJSONString(respData));
			
			if (respData.get("responseCode").equals("A001")) {
				payResp.setSuccess(true);
			} else {
				logger.error("call ipay error!");
			}
			payResp.setRespData(respData);
			
			PayRecord payRecord = payRecordMapper.getPayRecordByOrderNo(payReq.getOrderNo());
			payRecordMapper.updPayRecordRespData(payRecord.getId(), JSONObject.toJSONString(respData));
			
		} catch (Exception e) {
			logger.error("send http req meet error!",e);
		}
		
		return payResp;
	}

}
