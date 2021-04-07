package wp.itheima.web.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import wp.itheima.domain.User_in;
import wp.itheima.service.ResourceService;
import wp.itheima.service.StudentService;

@WebServlet("/mindex")
public class m_index extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userid= request.getParameter("username");
		String password= request.getParameter("password");
		User_in userin=new User_in();
		if(userid!=null) {
			userin.setUser_name(userid);
			userin.setUsernameemail("已登录");
		}
		StudentService service = new StudentService();
		ResourceService resourceservice =new ResourceService();
		int student_count=service.student_count();
		request.setAttribute("student_count", student_count);
		int teacher_count=service.teacher_count();
		request.setAttribute("teacher_count", teacher_count);
		int resource_count=resourceservice.resource_count();
		request.setAttribute("resource_count", resource_count);
		
		request.setAttribute("User_name", userin.getUser_name());
		request.setAttribute("User_email", userin.getUsernameemail());
		request.getRequestDispatcher("/manage/jsp/index.jsp").forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//对于post请求，设置请求编码，防止乱码
		request.setCharacterEncoding("utf-8");
		//设置响应正文的编码和浏览器解码采用的编码
		response.setContentType("text/html;charset=utf-8");
		doGet(request,response);
	}
}