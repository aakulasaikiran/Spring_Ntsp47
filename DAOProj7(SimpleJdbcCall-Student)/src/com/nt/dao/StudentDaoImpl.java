package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.nt.bo.StudentBO;

public class StudentDaoImpl implements StudentDao {
	
	private SimpleJdbcCall sjc;
	
	public void setSjc(SimpleJdbcCall sjc) {
		this.sjc = sjc;
	}


	@Override
	public StudentBO getStudentDetails(int stno) {
		sjc.setProcedureName("GETDETAILS");
		   //In params
		    Map<String ,Object> inMap=new HashMap<String,Object>();
		    inMap.put("no",stno);
		   //execute pl/sql procdure
		    Map <String,Object> outMap=sjc.execute(inMap);
		    System.out.println(outMap);
		  //  conver outMap into Bo 
		     StudentBO bo=new StudentBO();
		      bo.setSno(stno);
		      bo.setSname((String)outMap.get("NAME"));
		      bo.setSadd((String)outMap.get("ADDRS"));
		   return bo;
	}

}
