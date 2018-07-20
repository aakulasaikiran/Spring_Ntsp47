package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowWelcomePageController {
	
	@RequestMapping("/home.htm")
	public String showHome(Map<String,String> map){
		//add model atrtibute
		map.put("msg","Welcome to 100% code Based Spring MVC");
		return "welcome";
		
	}

}
