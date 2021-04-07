package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExamServlet
 */
@WebServlet("/ExamServlet")
public class ExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String quest1 = request.getParameter("q1");
		String quest2 = request.getParameter("q2").trim();
		String[] quest3 = request.getParameterValues("q3");
		String quest4 = request.getParameter("q4");
		int score = 0;
		if(quest1!=null && quest1.equals("3")) {
			score = score + 25; //答对一题加25分
		}
		if(quest2!=null && (quest2.equals("HttpServlet") || quest2.equals("javax.http.HttpServlet"))) {
			score = score + 25;
		}
		if(quest3!=null && quest3.length==2 && quest3[0].equals("1") && quest3[1].equals("3")) {
			score = score + 25;
		}
		if(quest4!=null && quest4.equals("3")) {
			score = score + 25;
		}
		out.println("<html><head>");
		out.println("<title>测试结果</title>");
		out.println("</head><body>");
		out.println("你的成绩是："+score+"分");
		out.println("</body></htmo>");
	}

}
