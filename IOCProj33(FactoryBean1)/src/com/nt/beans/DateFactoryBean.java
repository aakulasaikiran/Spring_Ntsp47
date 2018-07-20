package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean<Date> {
	 private int year;
	  private int month;
	  private int date;
	  
	
	public void setYear(int year) {
		this.year = year;
	}

	
	public void setMonth(int month) {
		this.month = month;
	}

	

	public void setDate(int date) {
		this.date = date;
	}

	@Override
	public Date getObject() throws Exception {
		System.out.println("getObject()");
		return new Date(year,month,date);
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("getObjectType()");
			return Date.class;
	}

	@Override
	public boolean isSingleton() {
		System.out.println("isSingleton()");
		
		return true;
	}

}
