package com.zzti.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zzti.daoimpl.ShopperDaoImpl;
import com.zzti.entity.Cart;
import com.zzti.entity.Goods;
import com.zzti.entity.User;
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ShopperDaoImpl admin=new ShopperDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		User u=(User)request.getSession().getAttribute("user");
		String method=request.getParameter("method");
		String path=null;
		if("list".equals(method)) {
			HashMap<String,Goods> map=admin.searchGoods(u.getId());
			request.setAttribute("map", map);
			request.setAttribute("totalPrice", admin.totalPrice(map));
			path="cartList.jsp";
		}else if("add".equals(method)) {
			ArrayList<Cart> list=admin.searchCart(u.getId());
			String goods_id=request.getParameter("goods_id");
			int count=Integer.valueOf(request.getParameter("goods_count"));
			boolean flag=false;
			if(list!=null) {
			for(Cart e:list) {
				if(e.getGoods_id().equals(goods_id)) {
					admin.updateCart(e.getGoods_count()+1, e.getCart_id());
					flag=true;
					break;
				}
			}
			}
			if(!flag) {
			String cart_id="";
	        for(int i=0;i<5;i++)
	        	cart_id+=String.valueOf((int)(Math.random()*10));
	        String user_id=u.getId();
	        Cart cart=new Cart(cart_id,user_id,goods_id,1);
	        admin.addCart(cart);
			}
	        admin.updateGoods(count-1, goods_id);
	        path="AdminGoodsServlet?method=list1";
		}else if("delete".equals(method)) {
			String cart_id=request.getParameter("cart_id");
			admin.deleteCart(cart_id);
			path="CartServlet?method=list";
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
