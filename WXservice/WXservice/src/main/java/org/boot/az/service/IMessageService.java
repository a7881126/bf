package org.boot.az.service;

import java.util.Map;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年2月26日 上午10:03:18 

* 类说明 

*/
public interface IMessageService {

	/**
	 * 
	* @Title: differentiateMessage
	* @Description: 对微信消息的反馈
	* @param @param map
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	String differentiateMessage(Map<String, String> map);
	
	
//	/**
//	 * 
//	* @Title: dealText
//	* @Description: 处理文本信息
//	* @param @param map
//	* @param @return    参数
//	* @return String    返回类型
//	* @throws
//	 */
//	String dealText(Map<String, String> map);
//	
//	/**
//	 * 
//	* @Title: dealImage
//	* @Description: 处理图片
//	* @param @param map
//	* @param @return    参数
//	* @return String    返回类型
//	* @throws
//	 */
//	String dealImage(Map<String, String> map);
	
}
