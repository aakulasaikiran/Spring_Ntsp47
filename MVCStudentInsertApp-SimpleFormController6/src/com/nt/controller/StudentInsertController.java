package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCmd;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentInsertService;

public class StudentInsertController extends SimpleFormController {
	private StudentInsertService  service;

	public void setService(StudentInsertService service) {
		this.service = service;
	}

	@Override
 public  ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object cmd,
			BindException errors) throws Exception {
		StudentDTO  dto=null;
		StudentCmd command=null;
		String resultMsg=null;
		//type casting
		command=(StudentCmd)cmd;
		//Convert Command to DTO obj
		dto=new StudentDTO();
		dto.setSno(command.getSno());
		dto.setSname(command.getSname());
		dto.setSadd(command.getSadd());
		//use SErvice
		resultMsg=service.register(dto);
		//create and return ModelAndView obj
		return new ModelAndView("result","resMsg",resultMsg);
	}//method
}//class

