package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController{

	@Override
	public  ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
	    Calendar calendar=null;
	    int hour=0;
	    String message=null;
	    ModelAndView mav=null;
	    //Get System date and time
	    calendar=Calendar.getInstance();
	    //get current hour of the day
	    hour=calendar.get(Calendar.HOUR_OF_DAY);
	    //generate wish messge
	    if(hour<=12)
	    	message="GM";
	    else if(hour<=16)
	    	message="GA";
	    else if(hour<=20)
	    	message="GE";
	    else
	    	message="GN";
	    // create MAV having lvn, attribute
		mav=new ModelAndView();
		mav.setViewName("result");
		mav.addObject("wishMsg",message);
		return mav;
	}//handleRequest(-,-)
}//class
