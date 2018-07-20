package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.StudentBO;
import com.nt.dao.RegisterStudentsDAO;
import com.nt.dto.StudentDTO;

public class RegisterStudentsServiceImpl implements RegisterStudentsService{
  
private RegisterStudentsDAO dao;

public void setDao(RegisterStudentsDAO dao) {
	this.dao = dao;
}

	@Override
	public String registerStudents(List<StudentDTO> listDTO) {
		List<StudentBO> listBO=null;
		StudentBO bo=null;
		int result[]=null;
		//Convert ListDTO to ListBO
		listBO=new ArrayList<StudentBO>();
		for(StudentDTO dto:listDTO){
			bo=new StudentBO();
			bo.setSno(dto.getSno());
			bo.setSname(dto.getSname());
			bo.setSadd(dto.getSadd());
			listBO.add(bo);
		}
		//use DAO
		result=dao.insert(listBO);
		if(result!=null)
			return "Successful batch insertion";
		else
			return "Batch insertion failed";
	}//method

}//class
