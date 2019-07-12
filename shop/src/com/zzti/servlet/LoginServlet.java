package com.zzti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zzti.daoimpl.AdminUserImpl;
import com.zzti.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminUserImpl admin=new AdminUserImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session=request.getSession();
		String path=null;
		if(session.getAttribute("user")==null) {
<<<<<<< HEAD
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			User user=admin.checkUser(username, password);
			if(user.getId()!=null) {
				session.setAttribute("user",user);
				path="index.jsp";
=======
			String type=request.getParameter("type");
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			User user=admin.checkUser(username, password,type);
			if(user.getId()!=null) {
				session.setAttribute("user",user);
				if("ÓÃ»§".equals(type)) {
				path="index1.jsp";
				}else {
					path="index.jsp";
				}
>>>>>>> vcakn
			}else {
				path="login.jsp";
			}
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
