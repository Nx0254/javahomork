package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.User;
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String path="index.jsp";
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if("li".equals(username) && "123".equals(password)) {
			User user=new User();
			user.setUsername(username);
			user.setPassword(password);
			session.setAttribute("user",user);
			path="weclome.jsp";
		}
		else
			path="loginfail.jsp";
		request.getRequestDispatcher(path).forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
