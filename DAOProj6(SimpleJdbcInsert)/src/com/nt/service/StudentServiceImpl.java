package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public String registerStudent(StudentDTO dto) {
		StudentBO bo=null;
		int result=0;
	    //Convert DTO class obj to BO obj
		 bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		//use DAO
		result=dao.insert(bo);
		  if(result==0)
			  return "Registration Failed";
		  else
			  return "Registration Success";
	}//registerStudent(-)
}//class
