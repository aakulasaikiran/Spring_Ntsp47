package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private  EmployeeDAO dao;

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public String searchEmpNameByNo(int no) {
		String name=null;
		//use dao
		name=dao.findEmpNameByNo(no);
		return name;
	}

	@Override
	public EmployeeDTO searchEmpDetailsByNo(int no) {
		EmployeeDTO dto=null;
		EmployeeBO bo=null;
		//use dao
		bo=dao.findEmpDetailsByNo(no);
		//Convert BO class obj to  DTO class obj
		dto=new EmployeeDTO();
		dto.setEno(bo.getEno());
		dto.setEname(bo.getEname());
		dto.setSalary(bo.getSalary());
		dto.setJob(bo.getJob());
		return dto;
	}

	@Override
	public String registerEmp(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int cnt=0;
		//convert DTO obj to BO
		bo=new EmployeeBO();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setJob(dto.getJob());
		bo.setSalary(dto.getSalary());
		//use DAO
		cnt=dao.insert(bo);
		if(cnt==0)
		 return "Registration failed";
		else
			return "Registration success";
	}//method
}//class
