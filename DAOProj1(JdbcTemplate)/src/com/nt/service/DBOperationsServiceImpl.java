package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.DBOperationsDAO;

public class DBOperationsServiceImpl implements DBOperationsService {
	

	private DBOperationsDAO  dao;

	public void setDao(DBOperationsDAO dao) {
		this.dao = dao;
	}
	@Override
	public String registerEmp(int eno, String name, String desg, int salary) {
		//use dao
		int cnt=dao.insert(eno, name, desg, salary);
		if(cnt==0)
			return "Emp Registration failed";
		else
			return "Emp Registration is succeded with emp no:"+eno;
	}

	@Override
	public int showSalary(int eno) {
		//use dao
		int salary=dao.getSalary(eno);
		return salary;
	}

	@Override
	public String hikeSalary(int eno, float percentage) {
		//get existing salary
		int salary=showSalary(eno);
		float newSalary=salary+salary*(percentage/100.0f);
		//use dAO
		int cnt=dao.updateSalary(eno,newSalary);
		  if(cnt==0)
			  return "Emp salary updation failed";
			  else 
			  return "Emp salary updated successfully";
	}

	@Override
	public Map<String, Object> getEmpDetails(int eno) {
		//use DAO
		Map<String,Object> map=dao.listEmpDetails(eno);
		return map;
	}

	@Override
	public List<Map<String, Object>> getAllEmpDetails(int eno) {
		//use dAO
		List<Map<String,Object>> list=dao.listAllEmpDetails();
		return list;
	}

	@Override
	public String fireEmp(int empno) {
		//Use dao
		int cnt=dao.deleteEmp(empno);
		if(cnt==0)
			return "Emp Not Deleted"; 
		else
			return "Emp Deleted with no"+empno;
	}

}//class
