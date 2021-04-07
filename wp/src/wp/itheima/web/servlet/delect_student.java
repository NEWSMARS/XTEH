package wp.itheima.web.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wp.itheima.domain.Student;
import wp.itheima.domain.User_in;
import wp.itheima.service.StudentService;


@WebServlet("/delect_student1")
public class delect_student extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String delect_id= request.getParameter("delete_id");
		Integer delete_id1 = new Integer(delect_id).intValue();
		StudentService service = new StudentService();	
		service.delect((int)delete_id1);
		/*service.delectbyid(delete_id);*/
		List<Student> Studentlist=service.findStudentByType1("1",1);
		
		request.setAttribute("Studentlist", Studentlist);
		User_in userin=new User_in();
		request.setAttribute("User_name", userin.getUser_name());
		request.setAttribute("User_email", userin.getUsernameemail());
		if(Studentlist!=null)
		request.getRequestDispatcher("/m_find_student").forward(request, response);	
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