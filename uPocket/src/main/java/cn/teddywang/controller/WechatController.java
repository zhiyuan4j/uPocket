package cn.teddywang.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.DocumentException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.teddywang.entity.wechat.NewsItem;
import cn.teddywang.entity.wechat.NewsMessage;
import cn.teddywang.entity.wechat.TextMessage;
import cn.teddywang.message.Messages;
import cn.teddywang.util.MessageUtil;
import cn.teddywang.util.WechatUtil;

@Controller
public class WechatController {
	@RequestMapping(value="/wechat.do", method=RequestMethod.GET)
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		
		PrintWriter out = response.getWriter();
		if(WechatUtil.checkSignature(signature, timestamp, nonce)) {
			out.print(echostr);
		}
	}
	@RequestMapping(value="/wechat.do", method=RequestMethod.POST )
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			Map<String, String> map = MessageUtil.xmlToMap(request);
			if("text".equals(map.get("MsgType"))) {
				if("u".equals(map.get("Content").trim()) || "U".equals(map.get("Content").trim())) {
					//回复网站主页图文消息给用户
					
					List<NewsItem> list = new ArrayList<NewsItem>();
					list.add(
							new NewsItem(
								"欢迎进入uPocket主页", 
								"点开图文链接进入uPocket主页", 
								"http://upocket.ngrok.natapp.cn/images/uPocket.jpg", 
								"http://upocket.ngrok.natapp.cn"
							)
					);
					NewsMessage txt = new NewsMessage(
							map.get("FromUserName"),
							map.get("ToUserName"),
							new Date().getTime(),
							"news",
							1, list);
					out.print(MessageUtil.newsMessageToXml(txt));
				} else {
					//未回复有效指令，返回菜单给用户
					TextMessage txt = new TextMessage(
							map.get("FromUserName"),
							map.get("ToUserName"), 
							new Date().getTime(),
							"text", 
							Messages.MENU, 
							null
							);
					out.print(MessageUtil.textMessageToXml(txt));
				}
			} else if("event".equals(map.get("MsgType"))){
				if("subscribe".equals(map.get("event"))) {
					TextMessage txt = new TextMessage(
							map.get("FromUserName"),
							map.get("ToUserName"), 
							new Date().getTime(),
							"text", 
							Messages.WELCOME, 
							null
							);
					out.print(MessageUtil.textMessageToXml(txt));
				}
			}else{
				//用户未回复文本消息，返回错误信息给用户
				TextMessage txt = new TextMessage(
						map.get("FromUserName"),
						map.get("ToUserName"), 
						new Date().getTime(),
						"text", 
						Messages.OUT_OF_SERVICE, 
						null
						);
				out.print(MessageUtil.textMessageToXml(txt));
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
	}
}
