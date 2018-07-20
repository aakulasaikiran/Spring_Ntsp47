package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentInsertDAO;
import com.nt.dto.StudentDTO;

public class StudentInsertServiceImpl implements StudentInsertService {
	private StudentInsertDAO  dao;
	

	public void setDao(StudentInsertDAO dao) {
		this.dao = dao;
	}


	@Override
	public String register(StudentDTO dto) {
		int  count=0;
		StudentBO bo=null;
		//convert DTO obj to BO obj
	    bo=new StudentBO();
	    bo.setSno(dto.getSno());
	    bo.setSname(dto.getSname());
	    bo.setSadd(dto.getSadd());
		//use DAO
		count=dao.insert(bo);
		//process result
		if(count==0)
			return bo.getSno()+"Registration Failed";
		else
			return bo.getSno()+"Registration Succeeded";
	}

}
