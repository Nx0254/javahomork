package com.zzti.entity;

public class User {
	private String id;
	private String username;
	private String password;
	private String gender;
	private String tel;
	private String info;
<<<<<<< HEAD
	public User() {
		super();
	}
	public User(String id, String username, String password, String gender, String tel, String info) {
=======
	private String type;
	public User() {
		super();
	}
	public User(String id, String username, String password, String gender, String tel, String info,String type) {
>>>>>>> vcakn
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.tel = tel;
		this.info = info;
<<<<<<< HEAD
=======
		this.type=type;
>>>>>>> vcakn
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel the tel to set
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
<<<<<<< HEAD
=======
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
>>>>>>> vcakn
	
}
