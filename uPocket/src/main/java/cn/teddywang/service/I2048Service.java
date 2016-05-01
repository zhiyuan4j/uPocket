package cn.teddywang.service;

import java.util.List;

import cn.teddywang.entity.User;
import cn.teddywang.entity.game.My2048;

public interface I2048Service {
	
	public My2048 getMy2048(User user);
	public My2048 add(My2048 my2048);
	public boolean update(My2048 my2048);
	public List<My2048> getTop10();
}
