package org.boot.az.service;

import java.util.Map;

import org.boot.az.util.TextMessageUtil;
import org.springframework.stereotype.Service;

/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年1月25日 下午2:33:03 

* 类说明 

*/
@Service
public class EventServiceImpl implements IEventService {


	
	public String dealEvent(Map<String, String> map) {
		TextMessageUtil textMessage = new TextMessageUtil();
		String message = null;
		String event = map.get("Event");

		switch(event) {
		case "CLICK":
			return dealClick(map);		
		case "VIEW":
			message = textMessage.initMessage(map,dealView(map));
			break;
		case "scancode_push":
			message = textMessage.initMessage(map,"暂不支持8");
			break;
		case "scancode_waitmsg":
			message = textMessage.initMessage(map,"暂不支持7");
			break;
		case "pic_sysphoto":
			message = textMessage.initMessage(map,"暂不支持6");
			break;
		case "pic_photo_or_album":
			message = textMessage.initMessage(map,"暂不支持5");
			break;
		case "pic_weixin":
			message = textMessage.initMessage(map,"暂不支持4");
			break;
		case "location_select":
			message = textMessage.initMessage(map,"暂不支持3");
			break;
		case "view_miniprogram":
			message = textMessage.initMessage(map,"暂不支持2");
			break;
		default:
			message = textMessage.initMessage(map,"欢迎来到小尼宅配综合服务号");
			break;
		}
		
		
		return message;
	}

	
	
	/**
	 * 
	* @Title: dealView
	* @Description: 处理view类型
	* @param @param map
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	private String dealView(Map<String, String> map) {

		return "进入网页";
	}

	/**
	 * 
	* @Title: dealClick
	* @Description: 处理click类型
	* @param @param map
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	private  String dealClick(Map<String, String> map) {
		TextMessageUtil textMessage = new TextMessageUtil();
		String message = null;
		String key = map.get("EventKey");
		switch (key) {
		case "11":
			message = textMessage.initMessage(map,"你点击了一下消息记录");
			break;
		case "35":	
			message = textMessage.initMessage(map,"你点击了一下35");
			break;
		default:
			message = textMessage.initMessage(map,"你点击了我了");
			break;
		}
		return message;
	}
}
