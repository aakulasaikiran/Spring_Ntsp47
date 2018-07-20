package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	 //Bean property
	private  Date dt;
   
	public WishGenerator() {
	   System.out.println("WishGenerator:0-param constructor");
	}
	
	
	
	public WishGenerator(Date dt) {
		System.out.println("WishGenerator:1-param constructor");
		this.dt = dt;
	}

	//setter method for setter injection
	public void setDt1(Date dt) {
		System.out.println("WishGenerator:setDt(-)");
		this.dt = dt;
	}
	
	//B.methid
	public String generateWishMsg(String user){
		System.out.println("WishGenerator: generateWishMsg(-)");
		System.out.println("Injected Date :"+dt);
	  // get current hour of the day
		int h=dt.getHours();
		//Generate Wish Msg
		if(h<12)
			return "Good morning"+user;
		else if(h<16)
			return "Good After noon"+user;
		else if(h<20)
			return "Good Evening"+user;
		else
			return "Good Nigtht"+user;
	}//B.method
}//class

