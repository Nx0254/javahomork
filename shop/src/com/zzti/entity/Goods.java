package com.zzti.entity;

public class Goods {
	private String goods_id;
	private String goods_name;
	private double goods_price;
	private String goods_info;
	private int goods_count;
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(String goods_id, String goods_name, double goods_price, String goods_info, int goods_count) {
		super();
		this.goods_id = goods_id;
		this.goods_name = goods_name;
		this.goods_price = goods_price;
		this.goods_info = goods_info;
		this.goods_count = goods_count;
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
	 * @return the goods_name
	 */
	public String getGoods_name() {
		return goods_name;
	}
	/**
	 * @param goods_name the goods_name to set
	 */
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	/**
	 * @return the goods_price
	 */
	public double getGoods_price() {
		return goods_price;
	}
	/**
	 * @param goods_price the goods_price to set
	 */
	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}
	/**
	 * @return the goods_info
	 */
	public String getGoods_info() {
		return goods_info;
	}
	/**
	 * @param goods_info the goods_info to set
	 */
	public void setGoods_info(String goods_info) {
		this.goods_info = goods_info;
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
