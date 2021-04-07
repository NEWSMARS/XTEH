package com.itheima.web.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itheima.domain.User;
import com.itheima.service.UserService;

public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession(true);
		User user1 =new User();
		String Uname=request.getParameter("user");
		String Upassword=request.getParameter("password");
		UserService service=new UserService();
		int is_true = 0;
		is_true=service.cheaklogin(Uname,Upassword);
	/*	user1 = service.findUserByname(Uname);
		String a=String.valueOf(user1.getUid());*/
		/*session.setAttribute("uid1",a);*/
		if(is_true==0) {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		else
			request.getRequestDispatcher("/start").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于post请求，设置请求编码，防止乱码
		request.setCharacterEncoding("utf-8");
		//设置响应正文的编码和浏览器解码采用的编码
		response.setContentType("text/html;charset=utf-8");
	}
}