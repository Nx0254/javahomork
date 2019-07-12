package com.zzti.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzti.daoimpl.AdminGoodsImpl;
import com.zzti.entity.Goods;
@WebServlet("/AdminGoodsServlet")
public class AdminGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminGoodsImpl admin=new AdminGoodsImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String method=request.getParameter("method");
		String path=null;
		if("list".equals(method)) {
			request.setAttribute("list", admin.findAllGoods());
			path="goodsList.jsp";
		}else if("delete".equals(method)) {
			String id=request.getParameter("id");
			admin.deleteGoods(id);
			path="AdminGoodsServlet?method=list";
		}else if("add".equals(method)) {
			String goods_id="";
	        for(int i=0;i<5;i++)
	        	goods_id+=String.valueOf((int)(Math.random()*10));
			String goods_name=request.getParameter("goods_name"); 
			double goods_price=Double.parseDouble(request.getParameter("goods_price")); 
			String goods_info=request.getParameter("goods_info"); 
			int goods_count=Integer.parseInt(request.getParameter("goods_count")); 
			Goods goods=new Goods(goods_id,goods_name,goods_price,goods_info,goods_count);
			admin.addGoods(goods);
			path="AdminGoodsServlet?method=list";
<<<<<<< HEAD
=======
		}else if("edit1".equals(method)) {
			String id=request.getParameter("id");
			request.setAttribute("goods", admin.findGoods(id));
			path="editGoods.jsp";
		}else if("edit2".equals(method)) {
			String goods_id=request.getParameter("goods_id");
			String goods_name=request.getParameter("goods_name"); 
			double goods_price=Double.parseDouble(request.getParameter("goods_price")); 
			String goods_info=request.getParameter("goods_info"); 
			int goods_count=Integer.parseInt(request.getParameter("goods_count")); 
			Goods goods=new Goods(goods_id,goods_name,goods_price,goods_info,goods_count);
			admin.updateGoods(goods);
			path="AdminGoodsServlet?method=list";
		}else if("serach".equals(method)) {
			String info=request.getParameter("info");
			request.setAttribute("list", admin.serachGoods(info));
			path="goodsList.jsp";
		}else if("list1".equals(method)) {
			request.setAttribute("list", admin.findAllGoods());
			path="goodsList1.jsp";
>>>>>>> vcakn
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
