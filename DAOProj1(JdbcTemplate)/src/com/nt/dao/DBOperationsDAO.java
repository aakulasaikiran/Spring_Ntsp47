package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface DBOperationsDAO {
	public int insert(int empno,String ename,String desg,int salary);
	public int getSalary(int empno);
	public int updateSalary(int empno,float newSal);
	public int deleteEmp(int empno);
	public Map<String,Object> listEmpDetails(int empno);
	public List<Map<String ,Object>> listAllEmpDetails();
}
