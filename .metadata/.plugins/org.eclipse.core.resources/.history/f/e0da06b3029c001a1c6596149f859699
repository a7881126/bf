package org.boot.az.bean;

import java.util.Map;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月18日 下午5:13:35
 * 
 *          类说明 语音消息
 * 
 */

public class VoiceMessage extends BaseMessage {

	private Voice Voice;

	public VoiceMessage(Map<String, String> requestMap, Voice voice) {
		super(requestMap);
		this.setMsgType("voice");
		this.Voice = voice;

	}

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		Voice = voice;
	}

}
