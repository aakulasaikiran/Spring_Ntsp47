package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.StudentService;

public class DeleteStudentController extends AbstractController {
	private  StudentService service;
	 public void setService(StudentService service) {
			this.service = service;
		}

	
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception { 
		 int no=0;
		 String result=null;
      // read student no given by hyperlink
		 no=Integer.parseInt(req.getParameter("no"));
		//use Service
		 result=service.fireStudent(no);
		 return new ModelAndView("list_students","result",result);
	}

}
