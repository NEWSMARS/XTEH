package com.itheima.dao;

import java.sql.SQLException;

import javax.mail.MessagingException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itheima.domain.Product;
import com.itheima.domain.User;
import com.itheima.utils.DataSourceUtils;
import com.itheima.utils.MailUtils;

public class UserDao {
	//添加user
	public void addUser(String uname, String contact, String password,String email) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		UserDao dao=new UserDao();
		int Cid=dao.findUid()+1;
		String sql = "insert into user values(?,?,?,?,?,0,0)";
		runner.update(sql,Cid,uname, contact,password,email);
		
	}
	//找到最大的Uid
	public int findUid() throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select Uid from user order by Uid desc limit 0,1";
		return (int) runner.query(sql,new ScalarHandler());
	}
	//查到是否注册了
	public void istrue(String uid) throws SQLException {
		Integer i = new Integer(uid).intValue();
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "update user set Uproduct=? where Uid=?";
		runner.update(sql, 1,i);
	}
	//通过名字找到password
	public String findpasswordByname(String uname) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select Upassword from user WHERE Uname=?  limit 0,1";
		return  (String) runner.query(sql,new ScalarHandler(),uname);
	}
	//通过名字找到是否注册了
	public String finis_trueByname(String uname) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select is_true from user WHERE Uname=?  limit 0,1;";
		return  (String) runner.query(sql,new ScalarHandler(),uname);
	}
	public User findUserByid(int uid) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where Uid=?";
		return runner.query(sql, new BeanHandler<User>(User.class), uid);
	}
	public User findUserByname(String uname) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where Uname=?";
		return runner.query(sql, new BeanHandler<User>(User.class), uname);
	}


}
