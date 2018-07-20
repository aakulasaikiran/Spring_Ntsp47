package com.nt.cfgs;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.nt.beans.WishGenerator;

@Configuration
public class BeanConfigurator{

	@Bean(name="wg")
	@Scope("prototype")
	@DependsOn("date")
	@Lazy(value=true)
	 public   WishGenerator createWishGenerator(){
		System.out.println("BC:createWishGenerator(-)");
	        return new WishGenerator();
	        }
@Bean(name="date")
@Scope("singleton")
public  Calendar  createCalendar(){
	System.out.println("BC:createCalendar(-)");
   return Calendar.getInstance();
}
}