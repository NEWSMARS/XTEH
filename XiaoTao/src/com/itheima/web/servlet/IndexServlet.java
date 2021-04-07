package com.itheima.web.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.Product;
import com.itheima.service.ProductService;
//进入classily前的servlet
public class IndexServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		//读取classily和page
		String ptype = request.getParameter("classily");
		String page =	request.getParameter("page");
		if(page==null) {page="1";}
		Integer i = new Integer(page).intValue();
		
		//读取商品
		ProductService service = new ProductService();	
		List<Product> Productlist=service.findProductListByType(ptype,i);
		request.setAttribute("Productlist", Productlist);
		
		//跳转到classily
		request.getRequestDispatcher("/classily.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于post请求，设置请求编码，防止乱码
		request.setCharacterEncoding("utf-8");
		//设置响应正文的编码和浏览器解码采用的编码
		response.setContentType("text/html;charset=utf-8");
	}
}