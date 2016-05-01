package cn.teddywang.entity.wechat;
/**
 * 微信的文本消息类
 * @author wang
 *
 */
public class TextMessage extends BaseMessage{
	
	private String Content;
	private String MsgId;
	
	public TextMessage() {
		
	}
	
	public TextMessage(String toUserName, String fromUserName, long createTime, String msgType, String content,
			String msgId) {
		super(toUserName, fromUserName, createTime, msgType);
		Content = content;
		MsgId = msgId;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
	
}
