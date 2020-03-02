package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.userdao;
import entity.user;

public class userdaoimpl implements userdao {

	@Override
	public void save(user user) {
		// TODO Auto-generated method stub
		List<user> list = new ArrayList<user>();
		list.add(user);
		for (user User  : list) {
			System.out.println(User.getName()+","+User.getAge());
		}
	}

}
