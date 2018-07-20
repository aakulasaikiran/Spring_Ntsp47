package com.nt.service;
import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("ws")
public class WishService {
	
	public String generateWishMsg(){
		Calendar calendar=null;
		int hour=0;
		//System date
		calendar=Calendar.getInstance();
		//get current of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		if(hour<=12)
			return "Good morning";
		else if(hour<=16)
			return "Good After noon";
		else if(hour<=20)
			return "Good Evening";
		else
			return "Good Night";
		
	}//method

}
