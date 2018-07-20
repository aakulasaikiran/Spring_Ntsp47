package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Viechle{
	private String beanId;
	
	 public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	public void move(){
	    //IOC cotainer
	     BeanFactory factory=
	           new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	     // get Engine Bean class obj  (Depedency lookup)
	     Engine engg=factory.getBean(beanId,Engine.class);
	      
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
