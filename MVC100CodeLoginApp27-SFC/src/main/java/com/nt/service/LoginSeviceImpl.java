package com.nt.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.UserBO;
import com.nt.dao.LoginDAO;
import com.nt.dto.UserDTO;

@Service
public class LoginSeviceImpl implements LoginService {
	@Resource
	private LoginDAO dao;
	
	@Override
	@Transactional(readOnly=true,transactionManager="txMgr")
	public String authenticate(UserDTO dto) {
	   UserBO bo=null;
	   int count=0;
		//convert DTO obj to BO obj
	   bo=new UserBO();
	   bo.setUname(dto.getUname());
	   bo.setPwd(dto.getPwd());
	   //use DAO
	   count=dao.validate(bo);
	    if(count==0)
		   return "InValid Credentials";
	    else
	    	return "Valid Credentials";
	}

}
