package com.nt.beans;
import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

public class WishGenerator{
   
  private Calendar calendar; 
  private Date date;

   public WishGenerator() {
	System.out.println("WishGenerator:0-param constructor");
}
   
   @Inject
  public void setCalendar(Calendar calendar){
	   System.out.println("WishGenerator:setCalendar(-)");
	this.calendar=calendar;
}

public   String generateWishMsg(){
      // get Current hour of the day
       int h=calendar.get(Calendar.DAY_OF_MONTH);
       if(h<=12)
            return "GM";
        else if(h<=16)
           return "GA";
        else if(h<=20)
             return "GE";
         else
             return "GN";
         }

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Calendar getCalendar() {
	return calendar;
}
   }