package com.zzti.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.zzti.dao.ShopperDao;
import com.zzti.entity.Cart;
import com.zzti.entity.Goods;
import com.zzti.util.DBUtils;

public class ShopperDaoImpl implements ShopperDao{
	private Connection coon=null;
	private PreparedStatement p=null;
	private ResultSet rs=null;
	@Override
	public void addCart(Cart cart) {
		coon=DBUtils.getConnection();
		String sql="insert into cart values(?,?,?,?)";
		try {
			p=coon.prepareStatement(sql);
			p.setString(1, cart.getCart_id());
			p.setString(2, cart.getUser_id());
			p.setString(3, cart.getGoods_id());
			p.setInt(4, cart.getGoods_count());
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, p, coon);
		}
	}

	@Override
	public HashMap<String,Goods> searchGoods(String user_id) {
		coon=DBUtils.getConnection();
		HashMap<String,Goods> map=new HashMap<>();
		String sql="select goods.goods_id,goods.goods_name,goods.goods_price,goods.goods_info,"
+ "cart.goods_count,cart_id from cart,goods where goods.goods_id in (select cart.goods_id from cart where user_id=?) and goods.goods_id=cart.goods_id";
		try {
			p=coon.prepareStatement(sql);
			p.setString(1, user_id);
			rs=p.executeQuery();
			while(rs.next()) {
				Goods good=new Goods();
				good.setGoods_id(rs.getString(1));
				good.setGoods_name(rs.getString(2));
				good.setGoods_price(rs.getDouble(3));
				good.setGoods_info(rs.getString(4));
				good.setGoods_count(rs.getInt(5));
				map.put(rs.getString(6), good);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, p, coon);
		}
		return map;
	}

	@Override
	public void deleteCart(String cart_id) {
		coon=DBUtils.getConnection();
		String sql="delete from cart where cart_id=?";
		try {
			p=coon.prepareStatement(sql);
			p.setString(1, cart_id);
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, p, coon);
		}
	}

	@Override
	public double totalPrice(HashMap<String,Goods> map) {
		double price=0;
		for (String key : map.keySet()) {
			price=map.get(key).getGoods_price()*map.get(key).getGoods_count();
			}
		return price;
	}

	@Override
	public void updateGoods(int count,String goods_id) {
		coon=DBUtils.getConnection();
		String sql="update goods set goods_count=? where goods_id=?";
		try {
			p=coon.prepareStatement(sql);
			p.setInt(1, count);
			p.setString(2, goods_id);
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, p, coon);
		}
	}

	@Override
	public ArrayList<Cart> searchCart(String user_id) {
		coon=DBUtils.getConnection();
		ArrayList<Cart> list=new ArrayList<>();
		String sql="select * from cart where user_id=?";
		try {
			p=coon.prepareStatement(sql);
			p.setString(1, user_id);
			rs=p.executeQuery();
			while(rs.next()) {
				Cart cart=new Cart();
				cart.setCart_id(rs.getString(1));
				cart.setUser_id(rs.getString(2));
				cart.setGoods_id(rs.getString(3));
				cart.setGoods_count(rs.getInt(4));
				list.add(cart);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, p, coon);
		}
		return list;
	}

	@Override
	public void updateCart(int count, String cart_id) {
		coon=DBUtils.getConnection();
		String sql="update cart set goods_count=? where cart_id=?";
		try {
			p=coon.prepareStatement(sql);
			p.setInt(1, count);
			p.setString(2, cart_id);
			p.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, p, coon);
		}
		
	}

}
