package com.cuit.spring.dao;

import java.util.List;

import com.cuit.spring.model.User;

public interface UserDao {

	public void saveUser(User user)throws Exception;
	public boolean checkUserExists(User user)throws Exception;
	public boolean checkUserExistsByName(String username)throws Exception;
	public List<User> getUsers() throws Exception;
    public  User loadUserById(int id) throws Exception;
    public  User loadUserByName(String name) throws Exception;
}
