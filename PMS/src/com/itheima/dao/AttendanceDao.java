package com.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.domain.Attendance;
import com.itheima.domain.Staff;
import com.itheima.utils.DataSourceUtils;

public class AttendanceDao {

	public List<Attendance> findAttendancebynname(String sname) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from attendance_view where sname=?  ";
		return runner.query(sql, new BeanListHandler<Attendance>(Attendance.class),sname);
	}

	public void delectbyid(int delectid20) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "DELETE from attendance where aid=?";
		runner.update(sql,delectid20);
		
	}



	public List<Attendance> findallAttendance(int page1) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from attendance_view limit ?,?";
		return runner.query(sql, new BeanListHandler<Attendance>(Attendance.class),(page1-1)*10,page1*10);
	}

	public void addAttendance(int sid, String staff_name, String type, String reason, String time) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into attendance(sid,type,reason,time) values(?,?,?,?)";
		runner.update(sql,sid,type,reason,time);
		
	}

	public Attendance Attendancechangebyid(int sid) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from attendance_view where aid=?  limit 0,1";
		return runner.query(sql, new BeanHandler<Attendance>(Attendance.class), sid);
	}

}
