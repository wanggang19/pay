package com.hongao.pay.game.withdraw;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.hongao.pay.config.ali.AliPayConfig;

/**
 * 
 * @author iTeller_zc
 *
 */
public class TestAliPay {
	
	@Test
	public void test(){
		System.out.println("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqxMzhop7UJKrbALp0IvyTJrhv9lbJOFgxbZo7BTsS+OrjRc/Fw2p6ytZAkKqsPSfkWwbKsKsz5012T1mER9q9sSsmrbFQov2pYrv8idO+3mddBwc75ubdprOUQan2ur83yLsMspQpSIbuZ79ogWZi1KkxhGiP6bhB8rrpk22WLhYJpnf5zPmTERVuJxXIrcBaobAtR8o+7M0VQy1K8WNhHgc46Dgh59cF8n8yDbvXCcdGsiRnblNKpHhaQ4uhmykFQlAwys0hBZgGW/nV0E/XjLFOW29mzAwMLRNJnKUK5vAOGUFeVJ+Eb0P5F5ii/YDXCMKt1AKb91cOhnfdz8UPwIDAQAB".length());
	}
	
	
	@Test
	public void testTransfer() throws AlipayApiException{
		//String priKey="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAI0ne6aEVndBMLcTX9+fk/GSHDpgKXhlR3AvjZgUE9Gj2Vey2E08j21lk2q2cE0ZXpXTw2/87zhE69X5Hgum564aulHwzKOYHr8nH7LN3tRHEzyhxUKzWehZi8c/ahyLy5jMt9EoH3eHHQmtoeOiFWO2CdR84OjREL6s9MQlIZxRAgMBAAECgYBUFj4570IXHrWnihol/ElEsjawq9Joj2TkNt/Rxbwcuc/ix37FXBtRHx6XhoEV3NQUyyb00qerTJt1R0cXx+DhWyEfXqUZeLrsDvGHCT8qfkoSXnHK/cwaHAXFaYPcf2nvF8K0qsOh5i7xNRWiZIBklBIR2UZrxgyGzHczJbckAQJBAMQOc4ua0DdflRrvQhXq9ho63Y2IYpzjdqYOhZTjSa5AIaaQoQ0Y1ZpooLR9mP1Vi4PQ8AQkQ1UTKfVigqDHakECQQC4T8ao41/eA1j1ceoHRhqBTGCSGjRbbJo188nPw2R+HxdS8KzOt7tZH2bGwCqaqMTojDjVnIdlk3dzyhmDFA4RAkEAkVNw/KOmAdW9DbkaUGrZP/owbhARoN/O/Co5hHKyFBL/npsIdk/ZTdqOfRu4gtidUPlYYImMy4woBvedgpYuwQJAEH6LL8gRZ0PzbRvBrt72NkYIimqv7tKcRmHH2MEKuEK+Cp0hSeqlaIdn4jeGWIrr/Ee4Ol2kvFFjKkiW2eUskQJAUnDgyuSOQq2p+M4IMxSQ35AEDjoWt6KDazereaXAkyAWWeqfy4woubmQhn2M/ptzchGCqBQoX8us/AvnZs1eOA==";
		AlipayClient alipayClient = new DefaultAlipayClient(AliPayConfig.URL, AliPayConfig.APP_ID, AliPayConfig.PRI_KEY, "json", "UTF-8", AliPayConfig.ALI_PUB_KEY, "RSA2");
		AlipayFundTransToaccountTransferRequest alipayFundTransToaccountTransferRequest = new AlipayFundTransToaccountTransferRequest();
		Map<String, String> params = new HashMap<String, String>();
		params.put("out_biz_no", String.valueOf(System.currentTimeMillis()));
		params.put("payee_type", "ALIPAY_LOGONID");
		params.put("payee_account", "17826685407");
		params.put("amount", "0.1");
		params.put("payer_show_name", "");
		params.put("payee_real_name", "张超");
		params.put("remark", "test");
		String bizContent = JSONObject.toJSONString(params);
		alipayFundTransToaccountTransferRequest.setBizContent(bizContent);
		AlipayFundTransToaccountTransferResponse resp = alipayClient.execute(alipayFundTransToaccountTransferRequest);
		System.out.println(JSONObject.toJSONString(resp));
	}
}
