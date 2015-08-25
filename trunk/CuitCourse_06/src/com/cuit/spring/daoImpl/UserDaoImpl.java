package com.cuit.spring.daoImpl;

import java.util.List;
import com.cuit.spring.Util.SuperDaoSupport;
import com.cuit.spring.dao.UserDao;
import com.cuit.spring.model.User;
public class UserDaoImpl extends SuperDaoSupport implements UserDao {
	
	public void saveUser(User user) throws Exception {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
		/*
		 * getHibernate的时候没有从beans中取得。
		 */
		
	}

	public boolean checkUserExists(User user) throws Exception {
		// TODO Auto-generated method stub
		
		List users = this.getHibernateTemplate().findByExample(user);
		if(users != null && users.size() > 0)
		{
			return true ;
		}else
		{
			return false;
		}
	
	}
	public boolean checkUserExistsByName(String username) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(username);
		List  users = this.getHibernateTemplate()
		.find("from User u where u.username = ?",username);
		if(users != null && users.size() > 0)
		{
			return true ;
		}else
		{
			return false;
		}
	}

	
	public List<User> getUsers() throws Exception {
		// TODO Auto-generated method stub
		return (List<User>)getHibernateTemplate().find("from User");
	}

	public User loadUserByName(String name) throws Exception {
		// TODO Auto-generated method stub
		
		List<User> users = (List<User>)getHibernateTemplate()
		.find("from User u where u.username = ?",name);
		if(users != null && users.size() > 0 )
		{
			return (User)users.get(0);
		}
		return null;
	}

	public User loadUserById(int id) throws Exception {
		// TODO Auto-generated method stub
	
		List<User> users =  (List<User>)getHibernateTemplate()
		.find("from User u where u.userid = ?",id);
	
		if(users != null && users.size() > 0 )
		{
			return (User)users.get(0);
		}
		return null;
	}


}
