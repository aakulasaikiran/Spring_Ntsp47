package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCmd;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class EditStudentController extends SimpleFormController {
	private StudentService service;
	
	
	public void setService(StudentService service) {
		this.service = service;
	}


	@Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
		int no=0;
		StudentDTO dto=null;
		StudentCmd  cmd=null;
		//read additional req param value.
		no=Integer.parseInt(request.getParameter("no"));
		//use SErvice to get Student details based on given no
		dto=service.searchStudentDetialsByNo(no);
		//Convert to DTO obj to Command obj
		cmd=new StudentCmd();
		cmd.setSno(dto.getSno());
		cmd.setSname(dto.getSname());
		cmd.setSadd(dto.getSadd());
		
		return cmd;
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
		result=service.modifyStudentDetails(dto);
		return new ModelAndView("list_students","result",result);
	}
}
