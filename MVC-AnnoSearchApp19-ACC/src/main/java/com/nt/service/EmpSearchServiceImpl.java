package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;
import com.nt.dao.EmpSearchDAO;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;

@Service("searchService")
public class EmpSearchServiceImpl implements EmpSearchService {
	@Inject
	private EmpSearchDAO dao;

	
	public void setDao(EmpSearchDAO dao) {
		this.dao = dao;
	}


	@Override
	public List<SearchResultDTO> process(SearchDTO dto) {
		SearchBO bo=null;
		List<SearchResultBO>listRBO=null;
		List<SearchResultDTO>listRDTO=null;
		SearchResultDTO rdto=null;
		// convert DTO to BO
		bo=new SearchBO();
		bo.setNo(dto.getNo());
		bo.setName(dto.getName()+"%");
		bo.setJob(dto.getJob()+"%");
		bo.setSalary(dto.getSalary());
		//use DAO
		listRBO=dao.search(bo);
		//convert ListRBO to ListRDTO
		listRDTO=new ArrayList<SearchResultDTO>();
		for(SearchResultBO rbo:listRBO){
			rdto=new SearchResultDTO();
			rdto.setNo(rbo.getNo());
			rdto.setName(rbo.getName());
			rdto.setJob(rbo.getJob());
			rdto.setSalary(rbo.getSalary());
			rdto.setDeptNo(rbo.getDeptNo());
			rdto.setMgrNo(rbo.getMgrNo());
			listRDTO.add(rdto);
		}//for
		
		return listRDTO;
	}//method
}//class
