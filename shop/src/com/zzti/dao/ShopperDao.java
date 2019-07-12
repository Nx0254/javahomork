package com.zzti.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.zzti.entity.Cart;
import com.zzti.entity.Goods;

public interface ShopperDao {
	void addCart(Cart cart);
	HashMap<String,Goods> searchGoods(String user_id);
	void deleteCart(String cart_id);
	double totalPrice(HashMap<String,Goods> map);
	void updateGoods(int count,String goods_id);
	void updateCart(int count,String cart_id);
	ArrayList<Cart> searchCart(String user_id);
}
