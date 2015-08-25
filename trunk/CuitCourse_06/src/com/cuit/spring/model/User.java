package com.cuit.spring.model;

import com.cuit.spring.vo.UserRegisterInfo;


public class User {
		private int userid;
		private String username;
		private String password;
	
		public User(UserRegisterInfo info)
		{
			this.username = info.getUsername();
			this.password = info.getPassword();
		}
		public User()
		{
				
		}
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		
}
