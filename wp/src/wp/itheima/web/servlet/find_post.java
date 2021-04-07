package wp.itheima.web.servlet;//这行代码用于自动识别包，并导包

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wp.itheima.dao.PostDao;
import wp.itheima.domain.Post;
import wp.itheima.domain.Student;
import wp.itheima.domain.User_in;
import wp.itheima.service.StudentService;


@WebServlet("/m_post_set")
public class find_post extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PostDao dao = new PostDao();	
		List<Post> postlist = null;
		try {
			postlist = dao.findPost();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("Post", postlist);
		User_in userin=new User_in();
		request.setAttribute("User_name", userin.getUser_name());
		request.setAttribute("User_email", userin.getUsernameemail());
		if(postlist!=null)
		request.getRequestDispatcher("/manage/jsp/find_post.jsp").forward(request, response);	
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