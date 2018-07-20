package com.nt.service;

import java.util.Date;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;
import com.nt.dao.StudCustDAO;

public abstract class StudCustService {
	private StudCustDAO dao;

	 public StudCustService() {
		System.out.println("StudCustService:0-paaram constructor");
	}
	
	public void setDao(StudCustDAO dao) {
		this.dao = dao;
	}
	public abstract StudentBO createStudentBO();
	public abstract CustomerBO createCustomerBO();
	
	public void processStudent(int no,String name,String course){
		//get StudentBO obj
		StudentBO bo=createStudentBO();
		bo.setId(no); bo.setName(name); bo.setCourse(course);
		
		//use DAo
		dao.insertStudent(bo);
	}
	
public void processCustomer(int no,String name,float billAmt){
	//get StudentBO obj
	CustomerBO bo=createCustomerBO();
	bo.setId(no); bo.setName(name); bo.setBillAmt(billAmt);
	
	//use DAo
	dao.insertCustomer(bo);
	}

}
