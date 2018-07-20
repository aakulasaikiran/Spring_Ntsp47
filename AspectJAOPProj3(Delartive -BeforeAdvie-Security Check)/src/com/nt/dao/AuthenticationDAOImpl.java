package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class AuthenticationDAOImpl implements AuthenticationDAO {
	private static final String AUTHENTICATE_QRY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?"; 
	private JdbcTemplate jt;
	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}


	@Override
	public int validate(UserDetails details) {
	  int cnt=(Integer)jt.queryForObject(AUTHENTICATE_QRY, Integer.class,details.getUsername(),details.getPassword());
		return cnt;
	}


	public JdbcTemplate getJt() {
		return jt;
	}

}
