package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDao;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao; 

	public void setDao(StudentDao dao) {
		this.dao = dao;
	}

	@Override
	public StudentDTO findStudentDetails(int no) {
		 //use dao
		StudentBO bo=dao.getStudentDetails(no);
		//convert BO obj to DTO
		StudentDTO dto=new StudentDTO();
		dto.setSno(bo.getSno());
		dto.setSname(bo.getSname());
		dto.setSadd(bo.getSadd());
		return dto;
	}

}
