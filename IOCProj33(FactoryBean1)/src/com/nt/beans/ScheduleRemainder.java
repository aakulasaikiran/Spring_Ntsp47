package com.nt.beans;

import java.util.Date;

public class ScheduleRemainder {
	private Date date;

	public void setDate(Date date){
		this.date = date;
	}
	
	public void remainer(){
		
		if(date.equals(date)){
			System.out.println("HI SAI KIRAN....HAPPY BORTH DAY TO YOU.....");	
		}
		else{
			System.out.println("No tasks are schedule");
		}
	}

	@Override
	public String toString() {
		return "ScheduleRemainder [date=" + date + "]";
	}
	

	
}
