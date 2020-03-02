package service.impl;

import dao.userdao;
import dao.impl.userdaoimpl;
import entity.user;
import service.userservice;

public class userserviceimpl implements userservice {

		userdao dao=new userdaoimpl();
	@Override
	public void save(user user) {
		// TODO Auto-generated method stub
		dao.save(user);
	}

}
