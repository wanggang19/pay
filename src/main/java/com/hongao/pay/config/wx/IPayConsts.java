package com.hongao.pay.config.wx;

/**
 * 现在支付常量
 * @author iTeller_zc
 *
 */
public class IPayConsts {
	
	/**
	 * 版本
	 */
	public static final String VERSION = "1.0.0";
	
	/**
	 * 交易类型 普通消费
	 */
	public static final String ORDER_TYPE = "01";
	
	/**
	 * 消费币种 人民币
	 */
	public static final String CURRENCY_TYPE = "156";
	
	/**
	 * 设备类型 手机网页
	 */
	public static final String DEVICE_TYPE = "0601";
	
	/**
	 * 设备类型 公众号
	 */
	public static final String MP_DEVICE_TYPE = "0600";
	
	/**
	 * 阿里支付渠道
	 */
	public static final String ALI_CHANNEL = "12";
	
	/**
	 * 微信支付渠道
	 */
	public static final String WECHAT_CHANNEL = "13";
	
	/**
	 * 微信输出模式
	 */
	public static final String OUT_PUT_TYPE = "2";
	
	/**
	 * 微信公众号输出模式
	 * 支付调起凭证tn值样式
	 * 当deviceType为0600，outputType为1时，返回支付信息，格式为:
	 * timeStamp%3dtimeStamp%26nonceStr%3dnonceStr%26prepay_id%3
	 * dprepay_id%26wxAppId%3dwxAppId%26paySign%3dpaySign%26signType%3dMD5(需要URLDecode)
	 */
	public static final String MP_OUT_PUT_TYPE = "1";
	
	/**
	 * 微信支付渠道
	 */
	public static final Integer RMB_RATE = 100;
	
	private IPayConsts(){
		
	}
}
