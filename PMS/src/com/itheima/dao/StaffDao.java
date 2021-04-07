package com.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itheima.domain.Staff;
import com.itheima.utils.DataSourceUtils;

public class StaffDao {

	public List<Staff> findallstaff(int page) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from staff  limit ?,?";
		return runner.query(sql, new BeanListHandler<Staff>(Staff.class),(page-1)*10,page*10);
	}






	public int findmostsid() throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select sid from staff order by sid desc limit 0,1";
		return (int) runner.query(sql,new ScalarHandler());
	}



	public void insertstaff(int sid, String staff_name, int age, int telephone, String join_time, String sex,String dept,int salary) throws SQLException {
	String s="0";
	QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
	String sql = "insert into staff values(?,?,?,?,?,?,?,?,?)";
	runner.update(sql,sid,staff_name,age,telephone,sex,join_time,s,dept,salary);
		
	}






	public Staff findstaffbyid(String sname) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from staff where sname=?  limit 0,1";
		return runner.query(sql, new BeanHandler<Staff>(Staff.class), sname);
	}






	public void delectbyid(int delectid) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "DELETE from staff where sid=?";
		runner.update(sql,delectid);
	}






	public int findidbyname(String staff_name) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select sid from staff where sname=? order by sid desc limit 0,1";
		return (int) runner.query(sql,new ScalarHandler(),staff_name);
	}






	public Staff staffchangebyid(int sid) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from staff where sid=?  limit 0,1";
		return runner.query(sql, new BeanHandler<Staff>(Staff.class), sid);
	}

}
