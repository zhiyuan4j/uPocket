package cn.teddywang.dao;

import cn.teddywang.entity.User;

public interface IUserDao {
	public boolean addUser(User user);
	public boolean validateUsername(String username);//true:合法用户名，false:非法用户名
	public boolean validateNickname(String nickname);//true:合法昵称，false:非法昵称
	public User getLoginUser(User user);
}
