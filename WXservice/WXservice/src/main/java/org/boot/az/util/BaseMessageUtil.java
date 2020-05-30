package org.boot.az.util;

import java.util.Map;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月18日 上午10:59:05
 * 
 *          类说明 消息封装工具类的基类,这里采用泛型,方便后期功能扩展
 * 
 */
public interface BaseMessageUtil<T> {

	/**
	 * 将回复的信息对象转xml格式给微信
	 * 
	 * @param message
	 * @return
	 */
	String messageToxml(T t);

	/**
	 * 回复的信息封装
	 * 
	 * @param FromUserName
	 * @param ToUserName
	 * @param Content
	 * @return
	 */
	String initMessage(Map<String, String> requestMap);
	
	


}
