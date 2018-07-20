package com.nt.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.command.SearchCommand;
import com.nt.dto.SearchDTO;
import com.nt.dto.SearchResultDTO;
import com.nt.service.EmpSearchService;

@Controller
public class EmpSearchController {
 @Inject
	private EmpSearchService service;
 
  public void setService(EmpSearchService service) {
		this.service = service;
	}
  
  
	@RequestMapping("/searchEmps.htm")
	public String search(Map<String,List<SearchResultDTO>> map, @ModelAttribute SearchCommand cmd)
			throws Exception {
		SearchCommand command=null;
		SearchDTO dto=null;
		List<SearchResultDTO> listRDTO=null;
		//type casting
		command=(SearchCommand)cmd;
		//Convert Command obj to DTO obj
		dto=new SearchDTO();
		dto.setNo(command.getNo());
		dto.setName(command.getName());
		dto.setJob(command.getJob());
		dto.setSalary(command.getSalary());
		//use SErivce class
		listRDTO=service.process(dto);
		// add Results to Model Attribute
		map.put("searchResults",listRDTO);

		return "list_emps";
	}//handle(-,-,-,-)
}//class
