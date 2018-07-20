package com.nt.service;

import java.util.Calendar;

public class WishService {

	public String generateWishMsg(){
		Calendar calendar=null;
		int hour=0;
		//get Sys date
		calendar=Calendar.getInstance();
		//get current hour
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		//generate Wish  Msg
		if(hour<=12)
			return "GM";
		else if(hour<=16)
			return "GA";
		else if(hour<=20)
			return "GE";
		else
			 return "GN";
	}//generateWishMsg(-)
}//class
