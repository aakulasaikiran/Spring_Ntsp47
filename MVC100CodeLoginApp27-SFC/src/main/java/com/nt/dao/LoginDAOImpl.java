package com.nt.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBO;

@Repository
public class LoginDAOImpl implements LoginDAO {
	private static final String AUTH_QRY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	@Resource
	private JdbcTemplate jt;
	
	@Override
	public int validate(UserBO bo) {
		int count=0;
		count=jt.queryForObject(AUTH_QRY,Integer.class,bo.getUname(),bo.getPwd());
		return count;
	}

}
