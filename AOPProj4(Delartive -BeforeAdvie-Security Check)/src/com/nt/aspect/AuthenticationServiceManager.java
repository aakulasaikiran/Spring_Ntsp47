package com.nt.aspect;

import com.nt.dao.AuthenticationDAO;
import com.nt.dao.UserDetails;

public class AuthenticationServiceManager {
	private ThreadLocal <UserDetails> threadLocal=new ThreadLocal<UserDetails>();
	private AuthenticationDAO dao;
	
	public void setDao(AuthenticationDAO dao) {
		this.dao = dao;
	}

	public void singnIn(String username,String password){
		UserDetails details=null;
		details=new UserDetails();
		details.setUsername(username); details.setPassword(password);
		//place in ThreadLocal obj for further use
		threadLocal.set(details);
	}
	
	public void signOut(){
		threadLocal.remove();
	}
	
	public boolean authenticate(){
		UserDetails details=null;
		int cnt=0;
		//get UserDetails obj
		details=threadLocal.get();
		//use dAO
		cnt=dao.validate(details);
		if(cnt==0)
			return false;
		else
			return true;
		
	}

}
