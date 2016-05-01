package cn.teddywang.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class WechatUtil {
	private static final String token = "wang";
//	private static final String appid = "wxa4c0b9c00d0f838c";
//	private static final String redirect_uri = "https://www.baidu.com";
//	private static final String scope = "snsapi_userinfo";
//	private static final String state = "1";
//	private static String oAuth = "https://open.weixin.qq.com/connect/oauth2/authorize?"
//			+ "appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
	
	public static boolean checkSignature(String signature, String timestamp, String nonce) {
		String[] arr = new String[] {token, timestamp, nonce};
		//1.排序
		Arrays.sort(arr);
		//2.拼接字符串
		StringBuffer content = new StringBuffer();
		for(int i=0; i<arr.length; i++) 
			content.append(arr[i]);
		//3.sha1加密
		String temp = SHA1(content.toString());
		
		return temp.equals(signature);
	}
	
//	public static String getOAuthUrl() {
//		oAuth.replace("APPID", appid);
//		oAuth.replace("REDIRECT_URI", redirect_uri);
//		oAuth.replace("SCOPE", scope);
//		oAuth.replace("STATE", state);
//		return oAuth;
//	}
	
	private static String SHA1(String decript) {
		try {
			MessageDigest digest = java.security.MessageDigest
					.getInstance("SHA-1");
			digest.update(decript.getBytes());
			byte messageDigest[] = digest.digest();
			StringBuffer hexString = new StringBuffer();
			for (int i = 0; i < messageDigest.length; i++) {
				String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
				if (shaHex.length() < 2) {
					hexString.append(0);
				}
				hexString.append(shaHex);
			}
			return hexString.toString();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}
	
}
