package com.cuit.spring.serviceImpl;

import java.util.List;
import com.cuit.spring.dao.UserDao;
import com.cuit.spring.model.User;
import com.cuit.spring.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	
	public void addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		this.userDao.saveUser(user);
	}
	
	public boolean userRegister(User user) throws Exception
	{
		//System.out.println(user.getUsername());
		if(userDao.checkUserExistsByName(user.getUsername()) == false)
		{
			userDao.saveUser(user);
			return true;
		}
		else
		{
			return false;
		}
	}

	public List<User> listUsers() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}

	public String userLoginCheck(User user) throws Exception {
		// TODO Auto-generated method stub
		User loaduser = userDao.loadUserByName(user.getUsername());
		if(loaduser == null)
		{
			//return "该用户不存在";
			return "error";
		}else if(loaduser != null && loaduser.getPassword().equals(user.getPassword()))
		{
			//return "登陆成功";
			return "welcome";
		}else
		{
			//return "密码错误";
			return "error";
		}
			
	}
	
	
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public UserServiceImpl()
	{
		
	}

	
	



}
