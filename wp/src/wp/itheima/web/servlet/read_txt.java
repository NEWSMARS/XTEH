package wp.itheima.web.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wp.itheima.domain.Resource;
import wp.itheima.domain.Student;
import wp.itheima.domain.User_in;
import wp.itheima.service.ResourceService;
import wp.itheima.service.StudentService;
import java.io.*;


@WebServlet("/m_student_add2")
public class read_txt extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentService service = new StudentService();	
		BufferedReader br = null;
		String line =null;
		String path2 = request.getParameter("path2");
		if(path2!=null) {
		//StringBuffer buf = new StringBuffer();
		try {
			//根据文件路径创建缓冲输入流

			br = new BufferedReader(new FileReader(path2));//filePath中是aaa.txt文件
			String str = "";
			
			//循环读取文件的每一行，对需要修改的行进行修改，放入缓冲对象中
			 while ((line = br.readLine()) != null) {
				 //设置正则将多余空格都转为一个空格
				 str=line+"\r\n";
				 
				 String[] dictionary =  str.split(",");
				 
					 int a = 1;
					 int b = 1;
					 
					int k = service.addstudent(dictionary[0],dictionary[1],a,(byte)b,dictionary[0],dictionary[4]);
				
				 
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
	         if (br != null) {// 关闭流
	               try {
	                   br.close();
	               } catch (IOException e) {
	                     br = null;
		        }
		     }
		}
		User_in userin=new User_in();
		request.setAttribute("User_name", userin.getUser_name());
		request.setAttribute("User_email", userin.getUsernameemail());
		request.getRequestDispatcher("/m_find_student").forward(request, response);	
	}
		else
			request.getRequestDispatcher("/manage/jsp/add_lot_student.jsp").forward(request, response);		
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