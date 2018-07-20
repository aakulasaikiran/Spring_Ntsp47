package com.nt.dao;

import com.nt.bo.CustomerBO;
import com.nt.bo.StudentBO;

public class StudCustDAO {
	
	public StudCustDAO() {
	  System.out.println("StudCustDAO:0-param constructor");
	}
	
	public void insertStudent(StudentBO bo){
		System.out.println("inserting student details "+bo.getId()+"  "+bo.getName()+"  "+bo.getDoj()+" "+bo.getCourse());
	}
	public void insertCustomer(CustomerBO bo){
		System.out.println("inserting student details "+bo.getId()+"  "+bo.getName()+"  "+bo.getDoj()+" "+bo.getBillAmt());
	}

}
