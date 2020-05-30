package org.boot.az.bean;

import java.util.Map;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月19日 下午4:51:21
 * 
 *          类说明
 * 
 */
public class BaseMessage {

	// 接收方账号(收到的OpenID)
	private String ToUserName;
	// 开发者微信号
	private String FromUserName;
	// 消息创建时间(整型)
	private long CreateTime;

	// 消息类型(text/music/news)
	private String MsgType;

	// 调用的时候把对象调换
	public BaseMessage(Map<String, String> requestMap) {
		this.ToUserName = requestMap.get("FromUserName");
		this.FromUserName = requestMap.get("ToUserName");
		this.CreateTime = System.currentTimeMillis()/1000;
	}

	public BaseMessage() {
		super();
	}

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
}
