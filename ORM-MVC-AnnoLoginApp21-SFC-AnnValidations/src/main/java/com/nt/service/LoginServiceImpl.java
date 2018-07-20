package com.nt.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.UserHLO;
import com.nt.dao.LoginDAO;
import com.nt.dto.UserDTO;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Inject
	private LoginDAO dao;

	@Override
	//@Transactional(propagation=Propagation.REQUIRED,transactionManager="txMgmr")
	public String authenticate(UserDTO dto) {
		long cnt=0;
		UserHLO bo=null;
		//convert DTO to BO
		bo=new UserHLO();
		bo.setUname(dto.getUname());
		bo.setPwd(dto.getPwd());
		//use DAO
		cnt=dao.validate(bo);
		return  cnt==0?"InValid Credentials":"Valid Credentails";
	}

}
