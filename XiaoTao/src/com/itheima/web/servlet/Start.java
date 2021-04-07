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
//进入index前的servlet
public class Start extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductService service = new ProductService();	
		UserService userservice = new UserService();	
		//将商品读出
		List<Product> newProductlist=service.findProductListByid(0,4);
		request.setAttribute("newProductList", newProductlist);
		List<Product> productlist1=service.findProductListByid(1,6);
		request.setAttribute("productlist1", productlist1);
		List<Product> productlist2=service.findProductListByid(2,6);
		request.setAttribute("productlist2", productlist2);
		List<Product> productlist3=service.findProductListByid(3,6);
		request.setAttribute("productlist3", productlist3);
		List<Product> productlist4=service.findProductListByid(4,6);
		request.setAttribute("productlist4", productlist4);
		/*String uid=request.getParameter("uid");
		User user=new User();
		user=userservice.findUserByid(uid);
		request.setAttribute("user1", user);*/
		//跳转到indexjsp
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于post请求，设置请求编码，防止乱码
		request.setCharacterEncoding("utf-8");
		//设置响应正文的编码和浏览器解码采用的编码
		response.setContentType("text/html;charset=utf-8");
	}
}