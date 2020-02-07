package com.bway.springproject.daos;

import com.bway.springproject.models.User;

public interface UserDao {
	
	public void signup(User u);
	public User login(String un,String psw);
	

}
