package Borune.web.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import Borune.service.Userservice;

public class Active extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String activeCode = request.getParameter("activeCode");
		Userservice service = new Userservice();
		try {
			service.active(activeCode);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath()+"/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于post请求，设置请求编码，防止乱码
		request.setCharacterEncoding("utf-8");
		//设置响应正文的编码和浏览器解码采用的编码
		response.setContentType("text/html;charset=utf-8");
	}
}