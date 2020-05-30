package org.boot.az.util;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Date;
import java.util.Map;

import org.boot.az.bean.Image;
import org.boot.az.bean.ImageMessage;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;



/** 

* @author 作者 : 阿铮

* @version 创建时间：2019年1月18日 下午5:16:20 

* 类说明 

*/
@Component
public class ImageMessageUtil implements BaseMessageUtil<ImageMessage> {

	private UploadUtil uploadUtil;
	
	
	/**
	 * 将信息转为xml格式
	 */
	public String messageToxml(ImageMessage imageMessage) {
		XStream xtream = new XStream();
		xtream.alias("xml", imageMessage.getClass());
		xtream.alias("Image", new Image().getClass());
		return xtream.toString();
	}
	
	/**
	 * 封装信息
	 */
	public String initMessage(Map<String, String> requestMap, Image image) {
		image.setMediaId(getmediaId());
		ImageMessage message = new ImageMessage(requestMap,image);
		message.setImage(image);
		return messageToxml(message);
	}
	/**
	 * 获取Media  测试
	 * @return
	 */
	public String getmediaId(){
		String path = "C:\\Users\\AZ-PC\\Desktop\\0.jpg";
		String mediaId = null;
		try {
			mediaId = uploadUtil.upload(path, "image");
			
		} catch (KeyManagementException | NoSuchAlgorithmException
				| NoSuchProviderException | IOException e) {
			e.printStackTrace();
		}
		return mediaId;
	}
	
	
	@Override
	public String initMessage(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

