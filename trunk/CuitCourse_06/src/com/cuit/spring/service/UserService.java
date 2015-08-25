package com.cuit.spring.service;

import java.util.List;

import com.cuit.spring.model.User;

public interface UserService {
		
	public void addUser(User user) throws Exception;
	public boolean userRegister(User user) throws Exception;
	public List<User> listUsers() throws Exception;
	public String userLoginCheck(User user) throws Exception;
}
