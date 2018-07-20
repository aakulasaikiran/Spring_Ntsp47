package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	public String findEmpNameByNo(int eno);
	public EmployeeBO findEmpDetailsByNo(int eno);
	public  int  insert(EmployeeBO bo);

}
