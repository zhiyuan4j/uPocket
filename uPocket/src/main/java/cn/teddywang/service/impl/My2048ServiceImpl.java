package cn.teddywang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.teddywang.dao.I2048Dao;
import cn.teddywang.entity.User;
import cn.teddywang.entity.game.My2048;
import cn.teddywang.service.I2048Service;
@Service("my2048Service")
public class My2048ServiceImpl implements I2048Service {
	@Autowired
	private I2048Dao my2048Dao;
	
	public My2048 getMy2048(User user) {
		
		return my2048Dao.getMy2048(user);
	}

	public My2048 add(My2048 my2048) {
		return my2048Dao.add(my2048);
	}

	public boolean update(My2048 my2048) {
		return my2048Dao.update(my2048);
	}
	
	public List<My2048> getTop10() {
		return my2048Dao.getTop10();
	}

}
