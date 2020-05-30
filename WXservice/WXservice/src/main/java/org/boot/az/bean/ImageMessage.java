package org.boot.az.bean;

import java.util.Map;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月18日 下午5:11:27
 * 
 *          类说明 图片消息
 * 
 */
public class ImageMessage extends BaseMessage {

	private Image Image;// Image节点

	public ImageMessage(Map<String, String> requestMap, Image image) {
		super(requestMap);
		this.setMsgType("image");
		this.Image = image;

	}

	public Image getImage() {
		return Image;
	}

	public void setImage(Image image) {
		Image = image;
	}

}
