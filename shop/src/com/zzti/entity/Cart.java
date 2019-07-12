package com.zzti.entity;

public class Cart {
	private String cart_id;
	private String user_id;
	private String goods_id;
	private int goods_count;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(String cart_id, String user_id, String goods_id, int goods_count) {
		super();
		this.cart_id = cart_id;
		this.user_id = user_id;
		this.goods_id = goods_id;
		this.goods_count = goods_count;
	}
	/**
	 * @return the cart_id
	 */
	public String getCart_id() {
		return cart_id;
	}
	/**
	 * @param cart_id the cart_id to set
	 */
	public void setCart_id(String cart_id) {
		this.cart_id = cart_id;
	}
	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the goods_id
	 */
	public String getGoods_id() {
		return goods_id;
	}
	/**
	 * @param goods_id the goods_id to set
	 */
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	/**
	 * @return the goods_count
	 */
	public int getGoods_count() {
		return goods_count;
	}
	/**
	 * @param goods_count the goods_count to set
	 */
	public void setGoods_count(int goods_count) {
		this.goods_count = goods_count;
	}
	
}
