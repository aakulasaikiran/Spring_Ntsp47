package com.nt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Autowired
	private WishService service;
	
/*	@RequestMapping("/wish.htm")
	public  ModelAndView process(){
		String wishMsg=null;
		//use service
		wishMsg=service.generateWishMsg();
		//return MAV
		return new ModelAndView("result","wMsg",wishMsg);
	}
*/
	/*
	 @RequestMapping("/wish.htm")
	  public String  process(ModelMap map){
		String wishMsg=null;
		//use service
		wishMsg=service.generateWishMsg();
		//model attribute
		map.put("wMsg",wishMsg);
		return "result";
	}
	*/
	
/*	 @RequestMapping("/wish.htm")
	  public String  process(Model model){
		String wishMsg=null;
		//use service
		wishMsg=service.generateWishMsg();
		//model attribute
		model.addAttribute("wMsg",wishMsg);
		return "result";
	}
*/	
	/*@RequestMapping("/wish.htm")
	public String  process(Map<String,String> map){
		String wishMsg=null;
		//use service
		wishMsg=service.generateWishMsg();
		//model attribute
		map.put("wMsg",wishMsg);
		return "result";
	}*/
	
	/*@RequestMapping("/wish.htm")
	public void  process(Map<String,String> map){
		String wishMsg=null;
		//use service
		wishMsg=service.generateWishMsg();
		//model attribute
		map.put("wMsg",wishMsg);
	}*/
	
/*	@RequestMapping("/wish.htm")
		public ModelMap  process(){
			String wishMsg=null;
			ModelMap map=null;
			//use service
			wishMsg=service.generateWishMsg();
			//model attribute
			map=new ModelMap();
			map.put("wMsg","wishMsg");
			return map;
		}*/
	 
	@RequestMapping("/wish.htm")
	public Map<String,String>  process(){
		String wishMsg=null;
		Map<String,String> map=null;
		//use service
		wishMsg=service.generateWishMsg();
		//model attribute
		map=new HashMap<String,String>();
		map.put("wMsg","wishMsg");
		return map;
	}
	 
	
	
	
}
