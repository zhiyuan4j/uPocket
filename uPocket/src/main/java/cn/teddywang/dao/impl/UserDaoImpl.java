package cn.teddywang.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.teddywang.dao.IUserDao;
import cn.teddywang.entity.User;
@Repository("userDao")
public class UserDaoImpl implements IUserDao {
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public boolean addUser(User user) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int i = sqlSession.insert("User.addUser", user);
		sqlSession.close();
		return i>0?true:false;
	}

	public boolean validateUsername(String username) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Integer> idList = sqlSession.selectList("User.validateUsername", username);
		sqlSession.close();
		return idList.size()>0?false:true;
	}

	public boolean validateNickname(String nickname) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Integer> idList = sqlSession.selectList("User.validateNickname", nickname);
		sqlSession.close();
		return idList.size()>0?false:true;
	}
	
	public User getLoginUser(User user) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> userList = sqlSession.selectList("User.getLoginUser", user);
		sqlSession.close();
		if(userList.size() != 0)
			return userList.get(0);
		else 
			return null;
	}

}
