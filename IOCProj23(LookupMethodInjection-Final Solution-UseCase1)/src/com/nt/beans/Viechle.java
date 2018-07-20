package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public abstract class Viechle{
	
	public abstract Engine getEngine();
	public void move(){
		// get Engine obj
		Engine engg=getEngine();
		engg.start();
		System.out.println("Viechle started and ready to move");
	 }
	 public void entertainment(){
	   System.out.println("DVD player");
	  }
	 public void soundHorn(){
	   System.out.println("SKODA horn");
	  }
}
