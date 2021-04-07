package com.itheima.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.domain.Product;
import com.itheima.domain.User;
import com.itheima.utils.DataSourceUtils;

public class ProductDao {
	//通过Type找到product
	public List<Product> findProductListByType(int ptype,int page) throws SQLException {
		if(ptype==100) {
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			String sql = "select * from product order by Pid desc limit ?,?";
			return runner.query(sql, new BeanListHandler<Product>(Product.class),(page-1)*15,page*15);
		}
		else {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from product where Ptype=? order by Pid desc limit ?,?";
		return runner.query(sql, new BeanListHandler<Product>(Product.class),ptype,(page-1)*15,page*15);
	}
	}
	//通过id找到product
	public List<Product> findProductListByid(int type, int max) throws SQLException {
		if(type==0) {
			QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
			String sql = "select * from product order by Pid desc limit ?,?";
			return runner.query(sql, new BeanListHandler<Product>(Product.class),0,max);
		}
		else {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from product where Ptype=? order by Pid desc limit ?,?";
		return runner.query(sql, new BeanListHandler<Product>(Product.class),type,0,max);
	}
	}
	public Product findProductByid(int uid) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from product where Pid=?";
		return runner.query(sql, new BeanHandler<Product>(Product.class), uid);
	}
	public List<Product> findProductListBytype(Integer i, int page) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from product where Ptype=? order by Pid desc limit ?,?";
		return runner.query(sql, new BeanListHandler<Product>(Product.class),i,0,page);
	}
	
	

}
