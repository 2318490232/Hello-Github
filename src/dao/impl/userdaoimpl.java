package dao.impl;

import java.util.ArrayList;
import java.util.List;

import dao.userdao;
import entity.user;

public class userdaoimpl implements userdao {
	List<user> list = new ArrayList<user>();
	@Override
	public void save(user user) {
		// TODO Auto-generated method stub

		list.add(user);
		for (user User  : list) {
			System.out.println(User.getName()+","+User.getAge());
		}
	}

	@Override
	public void update(user user) {
		// TODO Auto-generated method stub
		for (user User  : list) {
			System.out.println("执行修改信息的操作");
		}
	}

}
