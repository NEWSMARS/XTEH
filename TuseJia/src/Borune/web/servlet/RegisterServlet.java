package Borune.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import Borune.utils.MailUtils;

import Borune.utils.CommonsUtils;

import Borune.domain.User;
import Borune.service.Userservice;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		System.out.println("1");
	Map<String, String[]> properties = request.getParameterMap();

	User user =new User();
	
		try {
			BeanUtils.populate(user, properties);
		} catch (IllegalAccessException | InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	user.setUid(CommonsUtils.getUUID());

	user.setState(0);

	String activeCode = CommonsUtils.getUUID();
	user.setCode(activeCode);
	
	Userservice userservice=new Userservice();
	boolean isRegisterSuccess = false;
		try {
		isRegisterSuccess = userservice.add(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(isRegisterSuccess==true){
			//发送激活邮件
			String emailMsg = "恭喜您注册成功，请点击下面的连接进行激活账户"
					+ "<a href='http://localhost:8080/Xiaotaoerhuo/active?activeCode="+activeCode+"'>"
							+ "http://localhost:8080/Xiaotaoerhuo/active?activeCode="+activeCode+"</a>";
			try {
				MailUtils.sendMail(user.getEmail(), emailMsg);
			} catch (MessagingException e) {
				e.printStackTrace();
			}
			
			
			//跳转到注册成功页面
			response.sendRedirect(request.getContextPath()+"/registerSuccess.jsp");
		}else{
			//跳转到失败的提示页面
			response.sendRedirect(request.getContextPath()+"/registerFail.jsp");
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
