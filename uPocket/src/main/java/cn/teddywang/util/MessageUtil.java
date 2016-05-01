package cn.teddywang.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.thoughtworks.xstream.XStream;

import cn.teddywang.entity.wechat.NewsItem;
import cn.teddywang.entity.wechat.NewsMessage;
import cn.teddywang.entity.wechat.TextMessage;

public class MessageUtil {
	/**
	 * 将用户的文本消息转成map类型
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws DocumentException
	 */
	public static Map<String, String> xmlToMap(HttpServletRequest request) throws IOException, DocumentException {

		Map<String, String> map = new HashMap<String, String>();
		SAXReader reader = new SAXReader();

		InputStream ins = null;
		Document doc = null;
		ins = request.getInputStream();
		doc = reader.read(ins);
		Element root = doc.getRootElement();
		@SuppressWarnings("unchecked")
		List<Element> list = root.elements();
		for (Element e : list)
			map.put(e.getName(), e.getText());
		ins.close();
		return map;
	}

	/**
	 * 将用户的文本消息转成xml
	 * 
	 * @param textMessage
	 * @return
	 */
	public static String textMessageToXml(TextMessage textMessage) {
		XStream xstream = new XStream();
		xstream.alias("xml", textMessage.getClass());
		return xstream.toXML(textMessage);
	}
	
	public static String newsMessageToXml(NewsMessage newMessage) {
		XStream xstream = new XStream();
		xstream.alias("xml", newMessage.getClass());
		xstream.alias("item", NewsItem.class);
		return xstream.toXML(newMessage);
	}
}
