package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class LoginDAOImpl implements LoginDAO {
	private SimpleJdbcCall  sjc;

	public void setSjc(SimpleJdbcCall sjc) {
		this.sjc = sjc;
	}

	@Override
	public Map<String,Object> authenticate(String user, String pwd) {
		Map<String,String>inParams=null;
		Map<String,Object> outParams=null;
		//prepare In params
		inParams=new HashMap<String,String>();
		inParams.put("PRINCIPAL",user);
		inParams.put("pass",pwd);
		//set procedure name
		sjc.setProcedureName("p_authentication");
		//call pl/sql procedure
		 outParams=sjc.execute(inParams);
		return outParams;
	}

}
