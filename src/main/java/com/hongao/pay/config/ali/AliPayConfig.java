package com.hongao.pay.config.ali;

/**
 * 支付宝配置信息(请勿随意修改)
 * 
 * @author iTeller_zc
 *
 * @date 2017年12月7日 上午10:20:47
 */
public class AliPayConfig {
	
	/**
	 * 合作身份者ID，以2088开头由16位纯数字组成的字符串
	 */
	public static final String PARTNER = "2088221986063391";

	/**
	 * 收款支付宝账号
	 */
	public static final String SELLER_ID = "mzzf@hongaojs.com";
	
	/**
	 * 商户的私钥
	 */
	public static final String PRI_KEY ="MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCpmZG1LLsMOdOu2v7GJ4fYI2MsFtrEuKEiUHnlRJMZXoULsAmecPEFi3f1GY0Q//3dPUaZLqQ6f9cNnUWbalmyF5/exQYqOrtmAiF9RpaPUj5uZuZdQRK3FNxr6CSMt/D+c1aVOuM+VijoIpW6BjF8DfrsFEHL3/ZNbznDBlfvwZAe4tnv9BvdpPOJ1skIITSrjOnylBYihwW4PqCQIaneWg8coQdcWeoeIqxAagEiZEAD4MrBgXXPfGlV3WR/kCndiDk3NLSNSuJaRC/mI59L/V0Iw+ugMyMPwKMgNUxemm5smrxiw2ijeuf7ZUfsYqTyOKuAFjnG/HOhbtNiDvulAgMBAAECggEBAI0sH3VHvor2t5WdBOW8kf7/tdVFUOTfKoF9q3mEE03St7x61AbmzDlpVnjWw+2aqJ44G0P25w0qzL+wYfh0FiWANLsiFXehW8wVifrVfw3dz8nmLWsCd6md27yWh5X6psenCjM9yVpiLbrMzwUBkr9Ig81vLzWdP1BFfTcxWJFglf4LgVNMdpEtDIreQyhcEbU94MSCnKoxrtfd8WFYH8yNjKZLue6U/WF8+7VETahr2UPBoCRlLUhifFU3gNR5N0uWx9NnPljl6WqK5NFb30iy2AeE5DP++u7It1C1q2BCYVIzjkX/OJJflYpA2f6Vc3u//pqUKQrgWqhVnwWlaAECgYEA9gdDaNzWCwto2Si/ARtUKbbwiWSryg0sgBZ/tzDk28eAntW0qHXo3xEGFSvKwv45+/oYzP7OVIBBcFW2nPnL4WSVsJivdmR1WzG32WzK1aQspSoZ7awIJIlnAw5QEBWRx4xztCd5YzDl89FJfJ7PiRnz8de+5ecH6XXycC4WMcECgYEAsHlM7U6rcNPeoj6nUFwUXPqemfuNXVSLeNw2xyMM5VfsIQHrR+nc67XtfOcyK0Xe8sLjV1huMeCFBW2ud0a5TZfahzhMK6aK9VeuUQKsPa1JVnltYaleeDWeCTgD0Cxv7EUBYAkRyjLVo6pcMlJFH75ZGX2a7JA1iWpxWmce+uUCgYBI/0yz71oeusroK9vIQ0iMe/gQe+swrwn2EzbfrsUopJ/4AKZymVF35gAtBepKQs4HgmQbZrrnfYps/zGIj+E7RfHYDOV6tkHPxgernkjsbKLGeqBo0XM1DAOhd3yv2QaA855c5J1ync6Mshsgu6oOHsIvjnjYk9zYGyPMvw/cwQKBgQClT/wQETHob5COy8JQNPGeZ+dKt6qlUx2UCjYGNX9PGB3KjdGpfBnHdJUT/D+y6bEAGDB/EgeoEXqKq0RT15yeYzICmWpBObHSQmC44pgW7s1UhEtCwTYNxaxVVnO7/uSZn8q5+8T+dMBMoLndKdQ2+Eje6BrIoA6Gu3+UACW1QQKBgQDvxbabxfnzuXI5l0HgnLHVUypuYVvrnZK7ISDck0q89Ae/S8Lc4juxzCEecjbL4z6X2N0pu4KjojQtjaZMT/s1c8LrVY5phACEhlo1fI48OMbMgDAhTT5AwtfF8L1c+Ad6RTymrt3ocxjweP1QG8VHyAdOe93N+iDY0cwlvOPKaQ==";
	
	/**
	 * 应用公钥
	 */
	public static final String PUB_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqZmRtSy7DDnTrtr+xieH2CNjLBbaxLihIlB55USTGV6FC7AJnnDxBYt39RmNEP/93T1GmS6kOn/XDZ1Fm2pZshef3sUGKjq7ZgIhfUaWj1I+bmbmXUEStxTca+gkjLfw/nNWlTrjPlYo6CKVugYxfA367BRBy9/2TW85wwZX78GQHuLZ7/Qb3aTzidbJCCE0q4zp8pQWIocFuD6gkCGp3loPHKEHXFnqHiKsQGoBImRAA+DKwYF1z3xpVd1kf5Ap3Yg5NzS0jUriWkQv5iOfS/1dCMProDMjD8CjIDVMXppubJq8YsNoo3rn+2VH7GKk8jirgBY5xvxzoW7TYg77pQIDAQAB";
	
	/**
	 * 支付宝的公钥
	 */
	public static String ALI_PUB_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmoHvKG3RzuaHyI2IdvFiZcBP9AdOvdNc5YveFrChrHNeMo2nTIsf5mvSHFYuf5PTRnoYdGv+ZGE4/QPMaqhFtpG3fBXy31bp0GTiSJh61kMuyp6+B8EwsvyEq9md3Qw1XueYajKGKpEMP9EU+4rTGP2O24RhWoiVSESpxti67Pv43P+BabVw0VAc5c1uRlu7y3GK0dRwCRcHel5gagjmyeapDWBQRLaFkKMgnHS4F4BwAK9JCGuj4DurHdL4MgZPsgxG0N80I/JSOKKuV0hoDnf8VaGNluOXUpuSJtQp+mNlXtHS/VxSCSsNftKbfuvCT7oo18PExSHmnZJCQ/gD2wIDAQAB";

	/**
	 * 字符集
	 */
	public static String CHARSET = "UTF-8";

	/**
	 * 分润提现备注
	 */
	public static String REMARK = "分润提现";

	/**
	 * appid
	 */
	public static final String APP_ID = "2017121100575544";
	
	/**
	 * 请求网关
	 */
	public static final String URL = "https://openapi.alipay.com/gateway.do";
	
	/**
	 * 参数返回格式
	 */
	public static final String FORMAT = "json";
	
	/**
	 * 商户生成签名字符串所使用的签名算法类型，目前支持RSA2和RSA，推荐使用RSA2
	 */
	public static final String SIGN_TYPE = "RSA2";
	
	/**
	 * 签约产品代码
	 */
	public static final String PROD_CODE = "QUICK_WAP_WAY";
	
	/**
	 * 付款账号
	 */
	public static final String PAYER_NAME = "江苏鸿奥电子竞技发展有限公司";

	/**
	 * 转账成功响应码
	 */
	public static final String TRANSFER_SUCCESS = "10000";
	
	private AliPayConfig(){
		
	}

}
