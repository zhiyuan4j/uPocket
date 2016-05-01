package cn.teddywang.service;

import cn.teddywang.entity.User;

public interface IUserService {
	public boolean addUser(User user);
	public boolean validateUsername(String username);//true:合法用户名，false:非法用户名
	public boolean validateNickname(String nickname);//true:合法昵称，false:非法昵称
	public User getLoginUser(String username, String password);
}
