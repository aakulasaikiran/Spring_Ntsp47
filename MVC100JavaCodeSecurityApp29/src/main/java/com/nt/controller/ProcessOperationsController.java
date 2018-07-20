package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProcessOperationsController {

	@RequestMapping("/home.htm")
	public String showHomePage(){
		return "home";
	}
	
	@RequestMapping("/profile.htm")
	public String showProfilePage(Map<String,String> map){
		map.put("name","Raja");
		map.put("age","30");
		map.put("addrs","hyd");
		
		return "view_profile";
	}
	
	@RequestMapping("/phone.htm")
	public String showPhoneNumberPage(Map<String,String> map){
		map.put("residencePhone","9999999999");
		map.put("personalPhone","88888888888");
		map.put("officePhone","777777777");
		
		return "view_phone_numbers";
	}
	
	@RequestMapping("/logout.htm")
	public String showLogOutPage(){
		return "logout";
	}
	
	
	
	
	
}
