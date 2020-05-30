package org.boot.az.bean;

import java.util.Map;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月18日 上午10:51:15
 * 
 *          类说明 消息内容实体
 * 
 */
public class TextMessage extends BaseMessage {

	private String Content;// 文本消息内容

//	public TextMessage() {
//		
//	}
	
	
	public TextMessage(Map<String, String> requestMap) {
		super(requestMap);
		this.setMsgType("text");
	}

	public TextMessage(Map<String, String> requestMap, String content) {
		super(requestMap);
		this.setMsgType("text");
		Content = content;
	}
	

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}




}
