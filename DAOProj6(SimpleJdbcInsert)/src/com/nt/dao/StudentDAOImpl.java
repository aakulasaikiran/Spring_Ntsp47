package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private SimpleJdbcInsert  sji;

	public void setSji(SimpleJdbcInsert sji) {
		this.sji = sji;
	}

	@Override
	public int insert(StudentBO bo) {
		Map<String,Object> map=null;
		int result=0;
		//set Table name
		sji.setTableName("student");
		//prepare Params
		map=new HashMap<String,Object>();
		map.put("sno",bo.getSno());
		map.put("sname",bo.getSname());
		map.put("sadd", bo.getSadd());
		//execute Logic
		result=sji.execute(map);
		return result;
	}//insert(-)
}//class

