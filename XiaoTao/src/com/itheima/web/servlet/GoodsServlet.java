package com.itheima.web.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Product;
import com.itheima.domain.User;
import com.itheima.service.ProductService;
import com.itheima.service.UserService;

public class GoodsServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id1=request.getParameter("pid");
		Product product=new Product();
		User user =new User();
		UserService userservice =new UserService();
		ProductService service = new ProductService();
		product=service.findProductByid(id1);
		user=userservice.findUserByid(product.getPbuyer());
		request.setAttribute("product", product);
		request.setAttribute("user", user);
		List<Product> Productlist=service.findProductListBytype(product.getPtype(),5);
		request.setAttribute("Productlist", Productlist);
	
		request.getRequestDispatcher("/goods.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于post请求，设置请求编码，防止乱码
		request.setCharacterEncoding("utf-8");
		//设置响应正文的编码和浏览器解码采用的编码
		response.setContentType("text/html;charset=utf-8");
	}
}