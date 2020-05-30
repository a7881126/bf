package org.boot.az.util;

import java.text.SimpleDateFormat;
import java.util.Map;

import org.boot.az.bean.TextMessage;
import org.boot.az.pojo.Order;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月18日 上午11:10:05
 * 
 *          类说明
 * 
 */
@Component
public class TextMessageUtil implements BaseMessageUtil<TextMessage> {


	public String initMessage(Map<String, String> requestMap,Order order) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(order.getCreatedTime());
		StringBuilder sb = new StringBuilder();
		sb.append(order.getSalesOrderId());
		sb.append("\n\r");
		sb.append(dateString);
		sb.append("\n\r");
		sb.append(order.getContact());
		sb.append("\n\r");
		sb.append(order.getDesigner());
		TextMessage text = new TextMessage(requestMap,sb.toString());
		System.out.println(text.toString());
		return messageToxml(text);
	}
	
	/**
	 *  返回机器人回复信息
	 * 
	 * @param FromUserName
	 * @param ToUserName
	 */
	public String initMessage(Map<String, String> requestMap,String content) {
		TextMessage text = new TextMessage(requestMap,content);
		System.out.println(text.toString());
		return messageToxml(text);
	}

	
	/**
	 * 封装发送消息对象
	 * 
	 * @param FromUserName
	 * @param ToUserName
	 */
	public String initMessage(Map<String, String> requestMap) {
		TextMessage text = new TextMessage(requestMap);
		text.setContent(requestMap.get("Content"));
		System.out.println(text.toString());
		return messageToxml(text);
	}


	
	
	
	/**
	 * 将发送消息封装成对应的xml格式
	 */
	public String messageToxml(TextMessage message) {
		XStream xstream = new XStream();
		xstream.alias("xml", message.getClass());
		return xstream.toXML(message);
	}

}
