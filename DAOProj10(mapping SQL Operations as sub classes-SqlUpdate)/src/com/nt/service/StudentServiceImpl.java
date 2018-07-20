package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService{
	private StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public String modifyStudentDetails(StudentDTO dto) {
		StudentBO bo=null;
		int cnt=0;
	     //convert DTO obj to BO obj
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		//use DAO
		cnt=dao.updateStudentDetails(bo);
		if(cnt==0)
			 return dto.getSno()+"  Student Details are not Updated";
		else
			return dto.getSno()+"  Student Details are updated";
	}//method
}//class
