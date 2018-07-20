package com.nt.controller;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

public class StudentController {
	private StudentService service;
	
	public StudentController() {
		System.out.println("StudentController:0-param cosntructor");
	}
	public void setService(StudentService service) {
		System.out.println("StudentController:setService(-)");
		this.service = service;
	}
	
	public String process(String sno,String sname,String m1,String  m2,String m3){
		StudentVO vo=null;
		StudentDTO dto=null;
		String result=null;
		 //prepare VO class obj having inputs
		vo=new StudentVO();
		vo.setSno(sno); vo.setSname(sname);
        vo.setM1(m1); vo.setM2(m2); vo.setM3(m3);
        //convert VO class obj to DTO class obj
        dto=new StudentDTO();
        dto.setSno(Integer.parseInt(vo.getSno()));
        dto.setSname(vo.getSname());
        dto.setM1(Integer.parseInt(vo.getM1()));
        dto.setM2(Integer.parseInt(vo.getM2()));
        dto.setM3(Integer.parseInt(vo.getM3()));
        //Use Service class
        result=service.generateResult(dto);
        
        return result;
	}//process..
}//class

