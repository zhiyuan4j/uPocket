package cn.teddywang.test.dao;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.teddywang.dao.I2048Dao;
import cn.teddywang.dao.impl.My2048DaoImpl;
import cn.teddywang.entity.User;
import cn.teddywang.entity.game.My2048;

public class My2048DaoTest {

	private static ApplicationContext ctx;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	@Test
	public void test() {
		I2048Dao my2048Dao = ctx.getBean(My2048DaoImpl.class);
		My2048 my2048 = new My2048(2000, "save二维数组", 256, 8600);
		my2048.setUser(new User(1, null, null, null));
		my2048Dao.add(my2048);
		System.out.println(my2048.toString());
	}
	
	/*
	 * 测试排行榜
	 */
	@Test
	public void test1() {
		I2048Dao my2048Dao = ctx.getBean(My2048DaoImpl.class);
		List<My2048> list = my2048Dao.getTop10();
		for(My2048 i : list)
			System.out.println(i.getMaxScore()+"---"+i.getMaxLevel()+"----"+i.getUser().getNickname());
	}

}
