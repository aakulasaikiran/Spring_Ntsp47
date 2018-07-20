package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO   dao;

	public StudentServiceImpl() {
	 System.out.println("StudentServiceImpl:0-param constructor");
	}
	
	public void setDao(StudentDAO dao) {
		System.out.println("StudentServiceImpl:setDao(-)");
		this.dao = dao;
	}

	@Override
	public String generateResult(StudentDTO dto) {
		int total=0;
		float avg=0.0f;
		String result=null;
		StudentBO bo=null;
		int cnt=0;
		//write B.logic
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3.0f;
		if(avg<35)
			result="Fail";
		else
			result="Pass";
		//prepare BO having persistable Data
		 bo=new StudentBO();
		 bo.setSno(dto.getSno());
		 bo.setSname(dto.getSname());
		 bo.setTotal(total);
		 bo.setAvg(avg);
		 bo.setResult(result);
		//use DAO
		cnt=dao.insert(bo);
		 if(cnt==0)
			 return "Student Registration Failed";
		 else
			 return "Student Registration Succeded and result is::"+result;
	}//generateResult(-)
}//class

