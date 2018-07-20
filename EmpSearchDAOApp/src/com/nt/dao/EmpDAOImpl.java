package com.nt.dao;

import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;



public class EmpDAOImpl implements EmpDAO {
	

	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<Map<String, Object>> getEmpDetails(String cond) {
		//prepare SQL Qyery
		 // Select empno,ename,sal,job from emp where job in('CLERK','MANAGER') order by job
        String query="Select empno,ename,sal,job from emp where job in"+cond+" order by job";
        List<Map<String, Object>> list=jt.queryForList(query,new Object[]{});
		return  list;
	}//method
}//class
