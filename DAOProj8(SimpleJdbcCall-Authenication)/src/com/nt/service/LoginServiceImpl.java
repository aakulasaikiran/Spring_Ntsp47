package com.nt.service;

import java.util.Map;

import com.nt.dao.LoginDAO;

public class LoginServiceImpl implements LoginService {
	private LoginDAO  dao;
	
	public void setDao(LoginDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public String login(String user, String pwd) {
		Map<String,Object> outParams=null;
		//use dao
        outParams=dao.authenticate(user, pwd);	
        System.out.println(outParams);
		return (String)outParams.get("RESULT");
	}

}
