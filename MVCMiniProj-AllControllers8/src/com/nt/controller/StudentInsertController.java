package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCmd;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class StudentInsertController extends SimpleFormController {
	private StudentService service;
	
	
	public void setService(StudentService service) {
		this.service = service;
	}
	
	@Override
	public  ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		StudentCmd cmd=null;
		StudentDTO dto=null;
		String result=null;
		//type casting
		cmd=(StudentCmd)command;
		//convert Command obj to DTO obj
		dto=new StudentDTO();
		dto.setSno(cmd.getSno());
		dto.setSname(cmd.getSname());
		dto.setSadd(cmd.getSadd());
		//use Service
		result=service.registerStudent(dto);
		return new ModelAndView("list_students","result",result);
	}
}
