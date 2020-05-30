package org.boot.az.util;

import java.util.List;
import java.util.Map;

import org.boot.az.bean.Articles;
import org.boot.az.bean.NewsMessage;
import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.XStream;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月24日 下午5:05:45
 * 
 *          类说明
 * 
 */
@Component
public class NewsMessageUtil implements BaseMessageUtil<NewsMessage> {

	@Override
	public String messageToxml(NewsMessage message) {
		XStream xstream = new XStream();
		xstream.alias("xml", message.getClass());
		xstream.alias("item", new Articles().getClass());
		return xstream.toXML(message);
	}

	public String initMessage(Map<String, String> requestMap, List<Articles> Article) {
		NewsMessage news = new NewsMessage(requestMap, Article);
		System.out.println("对象" + news.toString());
		return messageToxml(news);
	}

	@Override
	public String initMessage(Map<String, String> requestMap) {
		// TODO Auto-generated method stub
		return null;
	}

}
