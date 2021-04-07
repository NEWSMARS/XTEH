package Borune.service;

import java.sql.SQLException;


import Borune.dao.UserDao;
import Borune.domain.User;

public class Userservice {

	public boolean add(User user) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("1");
		int a = 0;
		UserDao dao=new UserDao();
		 a=dao.add(user);
		return a>0?true:false;
	}

	public void active(String activeCode) throws SQLException {
		// TODO Auto-generated method stub
		UserDao dao=new UserDao();
		dao.active(activeCode);
	}

	public User login(String username, String password) throws SQLException {
		UserDao dao = new UserDao();
		return dao.login(username,password);
	}
	//校验用户名是否存在
	public boolean checkUsername(String username) {
		UserDao dao = new UserDao();
		long isExist = 0L;
		try {
			isExist = dao.checkUsername(username);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isExist>0?true:false;
	}

	
		
}
