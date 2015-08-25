package com.cuit.spring.action;

import java.util.List;
import com.cuit.spring.model.User;
import com.cuit.spring.service.UserService;
import com.cuit.spring.vo.UserRegisterInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/*
 * 
 * userAction   可以不用配置 由struts-spring plugins 和spring 配置管理
 */
public class UserAction extends ActionSupport implements ModelDriven<UserRegisterInfo>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserRegisterInfo info = new UserRegisterInfo();
	private UserService userservice;
	private List<User> users;
	private User user;  
	/*
	 * 先是初始化userAction 然后再是userAction 自己去找相关的
	 * entity name 并配合spring 将它们通过默认的构造函数将它们初始化。
	 */
	
	public String list() throws Exception
	{
		users = userservice.listUsers();
		return "listusers";
	}
	
	public String login() throws Exception
	{
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		return userservice.userLoginCheck(user);
	}
	public String register() throws Exception 
	{
		User user = new User(info);
		if(userservice.userRegister(user))
		{
			return "success";
		}
		else
		{
			return "fail";
		}
	}
	
	/*
	 * 
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	
	
	public UserRegisterInfo getModel() {
		// TODO Auto-generated method stub
		return info;
	}
	
	
	/*
	 * 
	 * get and set ways;
	 */
	public UserService getUserservice() {
		return userservice;
	}
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	public UserRegisterInfo getInfo() {
		return info;
	}

	public void setInfo(UserRegisterInfo info) {
		this.info = info;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
