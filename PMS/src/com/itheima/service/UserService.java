package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

public class UserService {
	
	//添加用户
	public void addUser(String user, String contact, String password, String eamil) {
		UserDao dao = new UserDao();
		try {
			dao.addUser(user,contact,password,eamil);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//查询是否验证了
	public void istrue(String uid) {
		UserDao dao=new UserDao();
		try {
			dao.istrue(uid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//查询是否可以登陆
	public int cheaklogin(String uname, String upassword) {
		UserDao dao=new UserDao();
		String password = "";
		String is_true = "";
		try {
			password =  dao.findpasswordByname(uname);
			is_true=dao.finis_trueByname(uname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String i="1";
		
		/*if(user.getUpassword().equals(upassword)&&user.getUproductlist().equals(i)) */
		if(is_true==null) return 0;
		else {
		 if(is_true.equals(i)&&password.equals(upassword)) return 1;
		else return 0;
		}
	}
	public User findUserByid(String id1) {
		User user= new User();
		UserDao dao=new UserDao();
		int Uid=Integer.parseInt(id1);
		try {
			user=dao.findUserByid(Uid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	public User findUserByname(String uname) {
		User user= new User();
		UserDao dao=new UserDao();
		try {
			user=dao.findUserByname(uname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
}
