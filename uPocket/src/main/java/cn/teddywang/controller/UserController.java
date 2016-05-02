package cn.teddywang.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.teddywang.entity.User;
import cn.teddywang.service.IUserService;
@SessionAttributes(value={"loginUser"})
@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="checkUsername.do", method=RequestMethod.GET)
	public void checkUsername(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		
		response.setContentType("text;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if(userService.validateUsername(username)) {
			out.write("success");
		} else {
			out.write("failure");
		}
		out.flush();
		out.close();
	}
	
	@RequestMapping(value="checkNickname.do", method=RequestMethod.GET)
	public void checkNicname(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String nickname = request.getParameter("nickname");
		
		response.setContentType("text;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if(userService.validateNickname(nickname)) {
			out.write("success");
		} else {
			out.write("failure");
		}
		out.flush();
		out.close();
	}
	
	@RequestMapping(value="login.do", method=RequestMethod.POST)
	public String login(User user, Map<String, Object> map) {
		User loginUser = userService.getLoginUser(user.getUsername(), user.getPassword());
		if(loginUser == null) {
			map.put("result", "用户名或密码错误");
			return "login";
		} else {
			map.put("loginUser", loginUser);
			return "index";
		}
	}
	
	@RequestMapping(value="register.do", method=RequestMethod.POST)
	public String register(User user, Map<String, Object> map) {
		boolean flag = userService.addUser(user);
		if(flag) {
			map.put("result", "注册成功");
		} else {
			map.put("result", "注册失败");
		}
		return "register";
	}
	
	@RequestMapping("login.jsp")
	public String getLogin() {
		return "login";
	}
	
	@RequestMapping("register.jsp")
	public String getRegister() {
		return "register";
	}
	@RequestMapping("index")
	public String getIndex() {
		return "index";
	}
	
}
