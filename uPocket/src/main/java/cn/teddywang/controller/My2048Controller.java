package cn.teddywang.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.teddywang.entity.User;
import cn.teddywang.entity.game.My2048;
import cn.teddywang.service.I2048Service;
@SessionAttributes(value={"my2048"})
@RequestMapping("/my2048")
@Controller
public class My2048Controller {
	
	@Autowired
	private I2048Service my2048Service;
	
	@RequestMapping("/index")
	public String getMy2048(Map<String, Object> map, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("loginUser");
		if(user == null) {
			//用户尚未登录，跳转到错误页
			return "error";
		} else {
			//获得用户的2048游戏记录
			My2048 my2048 = my2048Service.getMy2048(user);
			my2048.setUser(user);
			map.put("my2048", my2048);
			return "WEB-INF/my2048/index";
		}
	}
	
	@RequestMapping("/save")
	public void saveGame(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text;charset=utf-8");
		PrintWriter out = response.getWriter();
		//获得参数
		int score = Integer.parseInt(request.getParameter("score"));
		int level = Integer.parseInt(request.getParameter("level"));
		String board = request.getParameter("board");
		My2048 my = (My2048) request.getSession().getAttribute("my2048");
		//准备好要操作的My2048对象
		my.setScore(score);
		my.setSave(board);
		if(level > my.getMaxLevel())
			my.setMaxLevel(level);
		if(score > my.getMaxScore())
			my.setMaxScore(score);
		
		if(my.getId() == 0) {
			//用户第一次玩2048并保存游戏
			my = my2048Service.add(my);
			request.getSession().setAttribute("my2048", my);
			if(my2048Service.add(my).getId() != 0) {
				out.write("success");
			} else {
				out.write("failure");
			}
		} else {
			//更新用户保存的游戏
			if(my2048Service.update(my)) {
				out.write("success");
			} else {
				out.write("failure");
			}
		}
		out.flush();
		out.close();
	}
	
	@RequestMapping("/rank")
	public String getTop10(Map<String, Object> map) {
		List<My2048> ranks = my2048Service.getTop10();
		map.put("ranks", ranks);
		return "WEB-INF/my2048/rank";
	}
}
