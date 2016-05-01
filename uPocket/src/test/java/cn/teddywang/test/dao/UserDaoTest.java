package cn.teddywang.test.dao;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.teddywang.dao.IUserDao;
import cn.teddywang.dao.impl.UserDaoImpl;
import cn.teddywang.entity.User;

public class UserDaoTest {

	private static ApplicationContext ctx;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		IUserDao userDao = ctx.getBean(UserDaoImpl.class);
		System.out.println(userDao.addUser(new User("teddywang","wang","12345")));
	}
	
	@Test
	public void test1() {
		IUserDao userDao = ctx.getBean(UserDaoImpl.class);
		System.out.println(userDao.validateUsername("wang"));
	}
	
	@Test
	public void test2() {
		IUserDao userDao = ctx.getBean(UserDaoImpl.class);
		System.out.println(userDao.validateNickname("wang"));
	}
	
	@Test
	public void test3() {
		IUserDao userDao = ctx.getBean(UserDaoImpl.class);
		System.out.println(userDao.getLoginUser(new User(null, "wang", "12345")));
	}
}
