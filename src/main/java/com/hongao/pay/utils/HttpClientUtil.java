package com.hongao.pay.utils;

import javax.net.ssl.SSLContext;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Http协议客户端
 * 
 * @author: iTeller_zc
 */
public class HttpClientUtil {
	
	private static final Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);
    
    public static String sendSSLHttp(String url, String data,String charset) throws Exception {
    	final SSLContext sslContext = SSLContext.getDefault();
    	final SSLConnectionSocketFactory sssf = new SSLConnectionSocketFactory(sslContext, new String[]{"TLSv1.2"}, null, SSLConnectionSocketFactory.getDefaultHostnameVerifier());
        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sssf).build();
        HttpEntity entity = null;
		CloseableHttpResponse response = null;
		try {
			HttpPost httpPost = new HttpPost(url);
			entity = new StringEntity(data);
			httpPost.setEntity(entity);
			response = httpClient.execute(httpPost);
			StatusLine status = response.getStatusLine();
			if (HttpStatus.SC_OK != status.getStatusCode()) {
				logger.error("Http通讯失败 ,httpcode={} .", status.getStatusCode());
			    throw new Exception("Http通讯失败,httpcode=" + status.getStatusCode());
			}
			entity = response.getEntity();
		} catch (Exception e) {
			logger.error("http 请求失败 .", e);
			e.printStackTrace();
		}finally {
			if(response != null){
				response.close();
			}
			if(httpClient != null){
				httpClient.close();
			}
		}
        return EntityUtils.toString(entity, charset);
    }
}
