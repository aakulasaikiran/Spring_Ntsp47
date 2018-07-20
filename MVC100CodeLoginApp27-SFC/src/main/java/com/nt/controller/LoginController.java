package com.nt.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.User;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;

@Controller
public class LoginController {
	@Resource
	private LoginService service;
	
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String showLoginForm(Model model){
		User user=null;
		//create Cmd obj
		user=new User();
		//create model attribute
		model.addAttribute("userCmd",user);
		return "login";
	}
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String processLoginForm(@ModelAttribute("userCmd")User user,
			                                                      Map<String,String > map){
		UserDTO dto=null;
		String resultMsg=null;
		//Convert Cmd obj to DTO obj
		dto=new UserDTO();
		dto.setUname(user.getUname());
		dto.setPwd(user.getPwd());
		// use Service class
		resultMsg=service.authenticate(dto);
		//add result to model attribute
		map.put("result",resultMsg);
		return "login";
	}//method
}//class

