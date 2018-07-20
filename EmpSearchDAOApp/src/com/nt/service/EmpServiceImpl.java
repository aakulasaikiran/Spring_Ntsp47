package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.EmpDAO;

public class EmpServiceImpl implements EmpService {
	private EmpDAO dao;

	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Map<String, Object>> search(String[] jobs) {
		// prepare condition as required SQL query in DAO  class
		StringBuffer cond=null;
		List<Map<String,Object>>list=null;
		cond=new StringBuffer();
		cond.append("(");
		for(int i=0;i<jobs.length;++i){
			if(i==jobs.length-1){ // if i is pointing to last element
				cond.append("'"+jobs[i]+"'");
			}
			else{
				cond.append("'"+jobs[i]+"',");
			}
		}//for
		cond.append(")");
		//use dao
		 list=dao.getEmpDetails(cond.toString());
		
		return list;
	}//search(-)
}//class
