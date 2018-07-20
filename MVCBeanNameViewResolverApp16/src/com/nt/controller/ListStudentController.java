package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ListStudentController extends AbstractController {
	@Override
	public  ModelAndView handleRequestInternal(HttpServletRequest req,
			                                                                                    HttpServletResponse res) throws Exception {
         //Construct sample data
		 List<String> list=new ArrayList<String>();
		 list.add("raja"); list.add("ravi"); list.add("ramesh");
		 //create and MAV
		 if(req.getParameter("report").equals("pdf")){
			 return new ModelAndView("pdf_view","studDetails",list);
		 }
		 else{
			 return new ModelAndView("excel_view","studDetails",list);
		 }
	}//method
}//class
