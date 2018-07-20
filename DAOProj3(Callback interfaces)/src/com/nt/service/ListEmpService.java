package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface ListEmpService {
	public EmployeeDTO searchEmpByNo(int eno);

	public List<EmployeeDTO> searchEmpByDesg(String desg);

}
