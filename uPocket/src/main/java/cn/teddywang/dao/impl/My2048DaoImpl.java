package cn.teddywang.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.teddywang.dao.I2048Dao;
import cn.teddywang.entity.User;
import cn.teddywang.entity.game.My2048;
@Repository("my2048Dao")
public class My2048DaoImpl implements I2048Dao {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public My2048 getMy2048(User user) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<My2048> list = sqlSession.selectList("My2048.getMy2048", user.getId());
		sqlSession.close();
		if(list.size() == 0) {
			return new My2048();
		} else {
			return list.get(0);
		}
	}

	public My2048 add(My2048 my2048) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("My2048.addMy2048", my2048);
		sqlSession.close();
		return my2048;
	}
	
	//根据id更新保存的游戏
	public boolean update(My2048 my2048) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int result = sqlSession.update("My2048.updateMy2048", my2048);
		sqlSession.close();
		if(result >0)
			return true;
		else
			return false;
	}

	public List<My2048> getTop10() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<My2048> myList = sqlSession.selectList("My2048.getTop10");
		sqlSession.close();
		return myList;
	}

}
