package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class ListStudentController extends AbstractController {
	private StudentService service;
public void setService(StudentService service) {
		this.service = service;
	}
@Override
protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
    List<StudentDTO> listDTO=null;
    HttpSession ses=null;
	//use Service class
	listDTO=service.listStudents();
	//keep ListDTO in session
	ses=req.getSession();
	ses.setAttribute("lstStudents",listDTO);
	return new ModelAndView("list_students");
  }
}
