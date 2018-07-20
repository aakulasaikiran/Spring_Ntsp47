package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmpService;

public class MainServlet extends HttpServlet{
	 ApplicationContext ctx=null;
	 EmpService service=null;
	 public void init(){
		 //create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get bean
		 service=ctx.getBean("empService",EmpService.class);
	 }//init()
	 
	@Override
	public  void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    String desg[]=null;
	    List<Map<String,Object>> list=null;
	    RequestDispatcher rd=null;
		//read form data
	    desg=req.getParameterValues("jobs");
	    //use Servie class
	    list=service.search(desg);
	    //create request attribute to plass data to result.jsp
	    req.setAttribute("result",list);
	    //forward contriol to result.jsp
	    rd=req.getRequestDispatcher("/result.jsp");
	     rd.forward(req,res);
	}//doGet(-,-)
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      doGet(req,res);
	}
	
	@Override
	public void destroy() {
		ctx=null;
		service=null;
	}
	
	

}//class
