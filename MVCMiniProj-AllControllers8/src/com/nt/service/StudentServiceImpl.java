package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;
	

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<StudentDTO> listStudents() {
		List<StudentBO>listBO=null;
		List<StudentDTO>listDTO=null;
		StudentDTO dto=null;
		//use DAO
		listBO=dao.getAllStudents();
		//Convert listBO to ListDTO
		listDTO=new ArrayList<StudentDTO>();
		for(StudentBO bo:listBO){
			dto=new StudentDTO();
			dto.setSno(bo.getSno());
			dto.setSname(bo.getSname());
			dto.setSadd(bo.getSadd());
			listDTO.add(dto);
		}//for
		return listDTO;
	}//method
	
	@Override
	public StudentDTO searchStudentDetialsByNo(int no) {
	    StudentDTO dto=null;
	    StudentBO bo=null;
	    //use DAO
	   bo=dao.getStudentDetailsBySno(no);
	   //Convert BO to DTO 
	   dto=new StudentDTO();
	   dto.setSno(bo.getSno());
	   dto.setSname(bo.getSname());
	   dto.setSadd(bo.getSadd());
		return dto;
	}//method
	
	@Override
	public String modifyStudentDetails(StudentDTO dto) {
		StudentBO bo=null;
		int cnt=0;
	 //Convert DTO obj to BO obj
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		//use dAO
		cnt=dao.updateStudent(bo);
		if(cnt==0)
			return  dto.getSno()+" Update failed";
		else
			return  dto.getSno()+" Update Successfull";
	}//method

	@Override
	public String registerStudent(StudentDTO dto) {
		StudentBO bo=null;
		int cnt=0;
	 //Convert DTO obj to BO obj
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		//use dAO
		cnt=dao.insertStudent(bo);
		if(cnt==0)
			return  dto.getSno()+" Registration failed";
		else
			return  dto.getSno()+" Registration Successfull";
	}
	
	@Override
	public String fireStudent(int no) {
		int cnt=0;
		//Use DAO
	    cnt=dao.deleteStudent(no);
	     if(cnt==0)
	    	 return  "Stduent not Deleted ";
	     else
	    	 return "Student deleted"; 
	}
}//class
