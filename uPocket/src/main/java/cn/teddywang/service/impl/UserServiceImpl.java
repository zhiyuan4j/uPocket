package cn.teddywang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.teddywang.dao.IUserDao;
import cn.teddywang.entity.User;
import cn.teddywang.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;
	
	public boolean addUser(User user) {
		return  userDao.addUser(user);
	}

	public boolean validateUsername(String username) {
		return userDao.validateUsername(username);
	}

	public boolean validateNickname(String nickname) {
		return userDao.validateNickname(nickname);
	}

	public User getLoginUser(String username, String password) {
		return userDao.getLoginUser(new User(null, username, password));
	}

}
