package org.boot.az.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author 作者 : 阿铮
 * 
 * @version 创建时间：2019年1月24日 上午10:41:06
 * 
 *          类说明
 * 
 */
public class NewsMessage extends BaseMessage {

	private int ArticleCount;
	private List<Articles> Articles = new ArrayList<Articles>();

	public NewsMessage(Map<String, String> requestMap, List<Articles> article) {
		super(requestMap);
		this.setMsgType("news");
		ArticleCount = article.size();
		Articles = article;
	}

	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<Articles> getArticle() {
		return Articles;
	}

	public void setArticle(List<Articles> article) {
		Articles = article;
	}

	@Override
	public String toString() {
		return "NewsMessage [ArticleCount=" + ArticleCount + ", Article=" + Articles + "]";
	}

}
