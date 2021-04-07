package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.ProductDao;
import com.itheima.dao.UserDao;
import com.itheima.domain.Product;
import com.itheima.domain.User;

public class ProductService {
	//通过Type找到product
	public List<Product> findProductListByType(String ptype,int page) {
		ProductDao dao = new ProductDao();
		Integer i = new Integer(ptype).intValue();
		List<Product> productList = null;
		try {
			productList = dao.findProductListByType(i,page);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productList;
	}
	//通过id找到product
	public List<Product> findProductListByid(int ptype,int max) {
		ProductDao dao = new ProductDao();
		List<Product> productList = null;
		try {
			productList = dao.findProductListByid(ptype,max);
		} catch (SQLException e) {
			// TODO Auto-generated catch block.
			e.printStackTrace();
		}
		return productList;
	}
	public Product findProductByid(String id1) {
		Product product= new Product();
		ProductDao dao=new ProductDao();
		int Uid=Integer.parseInt(id1);
		try {
			product=dao.findProductByid(Uid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return product;
	}
	public List<Product> findProductListBytype(int ptype,int page) {
		ProductDao dao = new ProductDao();
		
		List<Product> productList = null;
		try {
			productList = dao.findProductListBytype(ptype,page);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productList;
	}

}
