package com.itheima.web.servlet.attendance;//这行代码用于自动识别包，并导包

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.service.AttendanceService;
@WebServlet("/updateattendance")
public class update_attendance_servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String staff_name=request.getParameter("staff_name");
		String type=request.getParameter("type");
		String reason=request.getParameter("reason");
		String time=request.getParameter("time");
		AttendanceService service = new AttendanceService();
		service.addAttendance(staff_name,type,reason,time);
		response.sendRedirect(request.getContextPath()+"/atendance_add.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于post请求，设置请求编码，防止乱码
		request.setCharacterEncoding("utf-8");
		//设置响应正文的编码和浏览器解码采用的编码
		response.setContentType("text/html;charset=utf-8");
	}
}