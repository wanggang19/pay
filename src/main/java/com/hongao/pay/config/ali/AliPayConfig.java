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
	public static final String PRI_KEY ="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCBtOk+z39gm/HEvq9xnGc1uZa9u7WoGA4C3bSDo1RqjhLeVbFUODwQQAsb13+YbvKvu6tOKmYDCd5k814LGs67rsdKAN1Dl13JkxmrH5fvp6K3Nm6JQG0vz1xJhyWeNEJYmcM3cCBym4mAnGhtVWjFStm4M8eTBfh563kuWckxrW11qv+OJ8MD5vLkSeJXgvjsylS0lTrWpUr6RpccS2vEH6o1lpLlEgn5ygxPR8sopo14m6MVUlwiXSpsouJeBU296e4j9+oSv7rfGadFQlTFA+AZjqnk6XW9pIKVplB40SPGbWRnILeAmuOogSmYX8gi9eCtUQL8ZvCxKb9P/LhLAgMBAAECggEAFDP5oK7xSDsCDYMmEKwr51JhCGyUfvpANHIUC+0E2RQIHFl8pYGc2WsgT9XhKf0eEAFLTYGNIiwHV/IQU+p5CQLQR9aaoEyTbzJabS0enVWfIqp3zSkb2LaTyWAjm+DH9MT+g0QTycYwRLgYC++hwhlGkEqAa4Yijdr/pRiXHgWL06Z9D9HFeyZDcTKYE49It82tqF2TVb5YrF5EzBE/wFIpWqN8hMGGV3t/yYtCEKHLh/YAGvQ0vLtWNvYqCs7s37FIZnnroyXS0b2Pksi8Z48NgtQ78Qvk7HoGv/JGMZ2A2JHLtozB/RWWQPi0xv4JJ9nOKaRWDtW85UkFSsrZAQKBgQDXtXt+VMDU+qD5zQiGppLmML8R3uJXhSUHvKcc5MrngAvPoM4yF6lF7hmksLf14ZwVG503+KnEscQf77qXAg083nPIxfg8brVPPDK3xal5hWkWdYIdqXVBP5RMe2drRaD/59RZZTUHWEtclsJFzfaKYba+p+VRo7Oxl0a3ta+DhQKBgQCZ7xL/dgVKzZfdN5sBp+z03TAKGzw5gTVEk7fst1mzLFsIzj3EG00zxQWwhWg4FssrE+1dC0vo3vDXeJWcY14xaLyQTrFhed9WLiCu400KMBHVOuBw0IYcm8hOVDOBl2inutHp5TgdDTyVwFE0DIwliDG9nwnLWTT1ZSyYXBqNjwKBgQCEjFkxPMUtWkC2nx3hF9RmrIeMZKgy3XbutSb/IzvnWxBm6koqD84NUYziXVD9P0AY3FoUfbFcU1vPwBCpIDKgN5VwRu4NvH2fDb+gm05ThP4ZNeXZcjrB+F6ZTK81BJk1BvC+aelW9ROB9oW0PSaEzBxuNV89dllCBFIJKxSJvQKBgE0SS3PGdp3eVDP5fE2W82giOsREoKG2FKKSR1to7attAONmx7whY0URV2jrUqQKnYyi/IxCdK5SuUlY4aechPO+GfMyw1Mnvu+aRtjpi5AXQ0Z8pRU3An7ebKrzM5ql4UthmWo/TxoUn4nm8YFa6ux7xVPIhhHfR0m6b1qVeuH3AoGAfBgzUM7iADOkYJJvpy+139l6LMvQlLUaI+ngnHbwxLZ6aws9UXkbSBmpD456LiqX7kW+/Yi5GJicSrNXNnESsFVGt3RClnvzxU+LwdtTEWP8za526gsU2H+FrZQ/L7gV/2Py24ECIT63t4zjSRen9rBkf69FHRnCKb7vxh7UB0M=";
	
	/**
	 * 应用公钥
	 */
	public static final String PUB_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgbTpPs9/YJvxxL6vcZxnNbmWvbu1qBgOAt20g6NUao4S3lWxVDg8EEALG9d/mG7yr7urTipmAwneZPNeCxrOu67HSgDdQ5ddyZMZqx+X76eitzZuiUBtL89cSYclnjRCWJnDN3AgcpuJgJxobVVoxUrZuDPHkwX4eet5LlnJMa1tdar/jifDA+by5EniV4L47MpUtJU61qVK+kaXHEtrxB+qNZaS5RIJ+coMT0fLKKaNeJujFVJcIl0qbKLiXgVNvenuI/fqEr+63xmnRUJUxQPgGY6p5Ol1vaSClaZQeNEjxm1kZyC3gJrjqIEpmF/IIvXgrVEC/GbwsSm/T/y4SwIDAQAB";
	
	/**
	 * 支付宝的公钥
	 */
	public static String ALI_PUB_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqxMzhop7UJKrbALp0IvyTJrhv9lbJOFgxbZo7BTsS+OrjRc/Fw2p6ytZAkKqsPSfkWwbKsKsz5012T1mER9q9sSsmrbFQov2pYrv8idO+3mddBwc75ubdprOUQan2ur83yLsMspQpSIbuZ79ogWZi1KkxhGiP6bhB8rrpk22WLhYJpnf5zPmTERVuJxXIrcBaobAtR8o+7M0VQy1K8WNhHgc46Dgh59cF8n8yDbvXCcdGsiRnblNKpHhaQ4uhmykFQlAwys0hBZgGW/nV0E/XjLFOW29mzAwMLRNJnKUK5vAOGUFeVJ+Eb0P5F5ii/YDXCMKt1AKb91cOhnfdz8UPwIDAQAB";

	/**
	 * 字符集
	 */
	public static String CHARSET = "UTF-8";

	/**
	 * appid
	 */
	public static final String APP_ID = "2016052701449375";
	
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
	
	private AliPayConfig(){
		
	}

}
