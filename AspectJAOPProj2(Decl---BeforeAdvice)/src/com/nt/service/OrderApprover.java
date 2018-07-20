package com.nt.service;

import java.util.Calendar;

public class OrderApprover {
	
	public String approveOrder(int orderId){
		Calendar calendar=null;
		int month=0;
		
		//get system date and time
		calendar= Calendar.getInstance();
		//get current month 
		month=calendar.get(Calendar.MONTH);
		//approve or reject the order
		if(month>=6 && month<=8)
			return "Order id :"+orderId +" has been approved";
		else
			return "Order id :"+orderId +" has been rejected";
	}//approveOrdr
}//class

