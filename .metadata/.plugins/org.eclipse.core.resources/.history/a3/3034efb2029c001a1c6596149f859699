package org.boot.az.util;

import java.util.Arrays;

import org.boot.az.bean.FinalUrl;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月19日 下午4:23:04
 * 
 *          类说明
 * 
 */
public class CheckUtil {


	/**
	 *  进行校检
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: AZ-PC
	 * @date: 2019年1月18日 上午10:46:22
	 *
	 *        Modification History: Date Author Version Description
	 *        ---------------------------------------------------------* 2019年1月18日
	 *        AZ-PC v1.0.0 修改原因
	 */
	public static boolean checkSignature(String signature, String timestamp, String nonce) {
		String[] str = new String[] { FinalUrl.TOKEN, timestamp, nonce };
		// 排序
		Arrays.sort(str);
		// 拼接字符串
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < str.length; i++) {
			buffer.append(str[i]);
		}
		// 进行sha1加密
		String temp = SHA1Util.encode(buffer.toString());
		// 与微信提供的signature进行匹对
		return signature.equals(temp);
	}
}
