package cn.teddywang.entity.wechat;

import java.util.List;
/**
 * 微信的图文消息类
 * @author wang
 *
 */
public class NewsMessage extends BaseMessage{
	private int ArticleCount;
	private List<NewsItem> Articles;
	
	public NewsMessage() {
		
	}

	public NewsMessage(String toUserName, String fromUserName, long createTime, String msgType, int articleCount,
			List<NewsItem> articles) {
		super(toUserName, fromUserName, createTime, msgType);
		ArticleCount = articleCount;
		this.setArticles(articles);
	}

	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<NewsItem> getArticles() {
		return Articles;
	}

	public void setArticles(List<NewsItem> articles) {
		Articles = articles;
	}

}
