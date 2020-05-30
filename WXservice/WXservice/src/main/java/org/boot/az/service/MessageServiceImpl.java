package org.boot.az.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.boot.az.bean.Articles;
import org.boot.az.pojo.Order;
import org.boot.az.util.NewsMessageUtil;
import org.boot.az.util.OCRUtil;
import org.boot.az.util.RobotUtil;
import org.boot.az.util.TextMessageUtil;
import org.springframework.stereotype.Service;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月25日 上午9:59:28
 * 
 *          类说明 区分信息
 * 
 */

@Service
public class MessageServiceImpl implements IMessageService {

	@Resource
	private IOrderService iOrderService;
	
	@Resource
	private IEventService iEventService;
	
	public  String differentiateMessage(Map<String, String> map) {

		String MsgType = map.get("MsgType");
		String content = map.get("Content");
		String message = null;

		TextMessageUtil textMessage = new TextMessageUtil();

		switch (MsgType) {
		case "text":
			message = dealText(map);
			break;
		case "event":
			message = iEventService.dealEvent(map);
			break;
		case "image":
			message = dealImage(map);
			break;
		case "voice":
			message = textMessage.initMessage(map, "暂不支持");
			break;
		case "video":
			message = textMessage.initMessage(map, "暂不支持");
			break;
		case "shortvideo":
			message = textMessage.initMessage(map, "暂不支持");
			break;
		case "location":
			message = textMessage.initMessage(map, "暂不支持");
			break;
		case "link":
			message = textMessage.initMessage(map, "暂不支持");
			break;
		default:
			message = textMessage.initMessage(map, "暂不支持");
			break;
		}
		return message;

	}
	
	
	public  String dealText(Map<String, String> map) {
		String content = map.get("Content");
		String message = null;

		TextMessageUtil textMessage = new TextMessageUtil();
		
		if(content.length()==10 && content.startsWith("WT9999999")) {
			//Order order = iOrderService.getOrderInfoBySalesOrderId(content);
			
			//message = textMessage.initMessage(map, order);

//		} else if ("图文".equals(content)) {
//			NewsMessageUtil nmu = new NewsMessageUtil();
//			List<Articles> articles = new ArrayList<Articles>();
//			articles.add(new Articles("这是图文标题", "图文消息详细介绍",
//					"http://mmbiz.qpic.cn/mmbiz_jpg/1DgwTE2EJVH1vx57lTbbG7af7IlBdOlNPzX0PEUB8DL3w3iaeoIGMWpNQxIDeMmLYGRfNBF2bOX2jial6K9ia7NIg/0",
//					"http://www.baidu.com"));
//			message = nmu.initMessage(map, articles);
//		} else if ("图片".equals(content)) {
//			// Ydff4-V7a0LVQM4UJd3WEOugPwNVxvmQC_-14LTMnP6hmYXwQLYGHmRBaoWaN4Bx
////			ImageMessageUtil imu = new ImageMessageUtil();
////			Image im = new Image();
		} else {
			String resp = RobotUtil.chat(content);
			System.out.println(resp+"==============");
			message = textMessage.initMessage(map, resp);
		}
		
		return message;
	}
	
	
	

	
	public  String dealImage(Map<String, String> map) {
		
		return OCRUtil.ORCResult(map);
	}


}
