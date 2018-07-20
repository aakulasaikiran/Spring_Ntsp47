package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.EmployeeBO;
import com.nt.dao.ListEmpDAO;
import com.nt.dto.EmployeeDTO;

public class ListEmpServiceImpl implements ListEmpService {
	private ListEmpDAO dao;

	public void setDao(ListEmpDAO dao) {
		this.dao = dao;
	}

	@Override
	public EmployeeDTO searchEmpByNo(int eno) {
		// use dao
		EmployeeBO bo = null;
		EmployeeDTO dto = null;
		bo = dao.getEmpDetailsByNo(eno);
		// Convert bo obj to DTO obj
		dto = new EmployeeDTO();
		dto.setEno(bo.getEno());
		dto.setEname(bo.getEname());
		dto.setDesg(bo.getDesg());
		dto.setSalary(bo.getSalary());

		return dto;
	}

	@Override
	public List<EmployeeDTO> searchEmpByDesg(String desg) {
		List<EmployeeBO> listbo = null;
		List<EmployeeDTO> listdto = null;
		EmployeeDTO dto = null;
		// use dao
		listbo = dao.getEmpDetailsByDesg(desg);
		// Convert ListBO to ListDTO
		listdto = new ArrayList<EmployeeDTO>();
		for (EmployeeBO bo : listbo) {
			dto = new EmployeeDTO();
			dto.setEno(bo.getEno());
			dto.setEname(bo.getEname());
			dto.setDesg(bo.getDesg());
			dto.setSalary(bo.getSalary());
			listdto.add(dto);
		} // for
		return listdto;
	}// method
}// inner class
