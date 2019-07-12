package com.zzti.dao;

import com.zzti.entity.User;

public interface AdminUserDao {
<<<<<<< HEAD
	User checkUser(String username,String password);
=======
	User checkUser(String username,String password,String type);
>>>>>>> vcakn
	void addUser(User user);
	void updateUser(User user);
}
