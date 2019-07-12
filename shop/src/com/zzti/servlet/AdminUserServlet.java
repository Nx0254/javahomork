package com.zzti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzti.daoimpl.AdminUserImpl;
import com.zzti.entity.User;
@WebServlet("/AdminUserServlet")
public class AdminUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AdminUserImpl admin=new AdminUserImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String method=request.getParameter("method");
		String path=null;
		if("add".equals(method)) {
			String id="";
	        for(int i=0;i<5;i++)
	        	id+=String.valueOf((int)(Math.random()*10));
	        String username=request.getParameter("username");
	        String password=request.getParameter("password");
	        String gender=request.getParameter("gender");
	        String tel=request.getParameter("tel");
	        String info=request.getParameter("info");
<<<<<<< HEAD
	        User user=new User(id,username,password,gender,tel,info);
=======
	        User user=new User(id,username,password,gender,tel,info,"ÓÃ»§");
>>>>>>> vcakn
	        admin.addUser(user);
	        path="login.jsp";
		}else if("edit".equals(method)) {
			String id=request.getParameter("id");
			String username=request.getParameter("username");
	        String password=request.getParameter("password");
	        String gender=request.getParameter("gender");
	        String tel=request.getParameter("tel");
	        String info=request.getParameter("info");
<<<<<<< HEAD
	        User user=new User(id,username,password,gender,tel,info);
=======
	        User user=new User(id,username,password,gender,tel,info,null);
>>>>>>> vcakn
	        admin.updateUser(user);
	        request.getSession().setAttribute("user",user);
	        path="userInfo.jsp";
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
