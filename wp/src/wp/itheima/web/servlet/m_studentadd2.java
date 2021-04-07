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


@WebServlet("/m_studentadd22")
public class m_studentadd2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentService service = new StudentService();	
		Student student = new Student();
		String id = request.getParameter("sid");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String class1 = request.getParameter("CLASS");
		String majorOrEle1 = request.getParameter("majorOrEle");
		String teacher = request.getParameter("teacher");
		String selfDescn = request.getParameter("selfDescn");
		int id1=0;
		if(!id.equals(""))
		id1 = new Integer(id).intValue();
		int ClASS1 = new Integer(class1).intValue();
		
		byte t=1;
		
		int k=0;
		
		if(!teacher.equals("")) {
			byte majorOrEle = (byte) new Byte(majorOrEle1).intValue();
			
		if(id.equals(""))
		k=service.addstudent(name,password,(int)ClASS1,majorOrEle,teacher,selfDescn);
		else {
			service.changestudent(id1,name,password,(int)ClASS1,majorOrEle,teacher,selfDescn);
		
		}
		User_in userin=new User_in();
		request.setAttribute("User_name", userin.getUser_name());
		request.setAttribute("User_email", userin.getUsernameemail());
		request.getRequestDispatcher("/m_find_student").forward(request, response);	
		}
		
		else {
			if(id.equals(""))
				k=service.addstudent(name,password,(int)ClASS1,t,"null",selfDescn);
				else {
					service.changestudent(id1,name,password,(int)ClASS1,selfDescn);
				}
			User_in userin=new User_in();
			request.setAttribute("User_name", userin.getUser_name());
			request.setAttribute("User_email", userin.getUsernameemail());
			request.getRequestDispatcher("/m_find_teacher").forward(request, response);	
		}
	
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