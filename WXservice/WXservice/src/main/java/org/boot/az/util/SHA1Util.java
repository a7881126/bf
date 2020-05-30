package org.boot.az.util;

import java.security.MessageDigest;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月19日 下午4:27:13
 * 
 *          类说明
 * 
 */
public class SHA1Util {

	private static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd',
			'e', 'f' };

	/**
	 * 
	 * @Function: SHA1.java
	 * @Description: 把密文转换成十六进制的字符串形式
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: AZ-PC
	 * @date: 2019年1月18日 上午10:44:29
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------* 2019年1月18日
	 *        AZ-PC v1.0.0 修改原因
	 */
	private static String getFormattedText(byte[] bytes) {
		int len = bytes.length;
		StringBuilder buf = new StringBuilder(len * 2);
		// 把密文转换成十六进制的字符串形式
		System.out.println(bytes.toString()+"=====");
		for (int j = 0; j < len; j++) {
			buf.append(HEX_DIGITS[(bytes[j] >> 4) & 0x0f]);
			buf.append(HEX_DIGITS[bytes[j] & 0x0f]);
		}
		System.out.println(buf.toString());
		return buf.toString();
	}

	/**
	 * 得到十六进制的字符串
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: AZ-PC
	 * @date: 2019年1月18日 上午10:44:53
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------* 2019年1月18日
	 *        AZ-PC v1.0.0 修改原因
	 */
	public static String encode(String str) {
		if (str == null) {
			return null;
		}
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
			messageDigest.update(str.getBytes()); // 输入字符串转换得到的字节数组
			return getFormattedText(messageDigest.digest());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
