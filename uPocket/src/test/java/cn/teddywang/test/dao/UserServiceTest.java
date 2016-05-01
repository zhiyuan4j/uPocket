package cn.teddywang.test.dao;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.teddywang.service.IUserService;
import cn.teddywang.service.impl.UserServiceImpl;

public class UserServiceTest {

	private static ApplicationContext ctx;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		IUserService userService = ctx.getBean(UserServiceImpl.class);
		System.out.println(userService.getLoginUser("wang", "12345"));
	}

}
