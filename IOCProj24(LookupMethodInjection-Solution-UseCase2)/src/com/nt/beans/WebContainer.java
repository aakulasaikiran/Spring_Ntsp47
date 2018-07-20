package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.FileSystemResource;

public abstract class WebContainer {
	 
	 public WebContainer() {
	  System.out.println("webContainer:0-param constructor");
	}
	 
	 public abstract  RequestHandler  getHandler();
	
	   public void processRequest(String data){
		    // get Depdent class obj 
		    RequestHandler handler=getHandler();
	       handler.handle(data);
	       System.out.println("Request processing is completed");
	     }
	 }