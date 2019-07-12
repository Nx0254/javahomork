package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;
@WebServlet("/AddPreference")
public class AddPreference extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String method=request.getParameter("method");
		String path=null;
		User user=(User) request.getSession().getAttribute("user");
		if("preference1".equals(method)) {
			String school=request.getParameter("school");
			String major=request.getParameter("major");
			user.setSchool(school);
			user.setMajor(major);
			request.getSession().setAttribute("user",user);
			path="preference2.jsp";
		}else if("preference2".equals(method)) {
			String[] skills=request.getParameterValues("skills");
			user.setSkills(skills);
			request.getSession().setAttribute("user",user);
			path="show.jsp";
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
