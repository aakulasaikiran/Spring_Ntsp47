package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.FileSystemResource;

public class Viechle implements ApplicationContextAware{
	private String beanId;
	private ApplicationContext context;
	
	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	
	//setter injetion
	 public void setBeanId(String beanId) {
		 System.out.println("Viechle:setBeanId(-)");
		this.beanId = beanId;
	}
	 
	 //aware injection
	 @Override
		public void setApplicationContext(ApplicationContext context){
		 System.out.println("Viechle:setApplicationContext(-)");
			this.context=context;
		}
	 
	 
	public void move(){
		    // get Engine Bean class obj  (Depedency lookup)
	     Engine engg=context.getBean(beanId,Engine.class);
	      
	     engg.start();
	    System.out.println("Viechle is ready to move");


	 }
	 public void entertainment(){
	   System.out.println("DVD player");
	  }
	 public void soundHorn(){
	   System.out.println("SKODA horn");
	  }
	
}
