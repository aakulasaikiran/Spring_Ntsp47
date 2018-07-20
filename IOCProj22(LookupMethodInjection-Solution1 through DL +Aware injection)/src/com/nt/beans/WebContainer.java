package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.FileSystemResource;

public class WebContainer implements ApplicationContextAware{
	private String beanId;
   private ApplicationContext context;
	 
	 public WebContainer() {
	  System.out.println("webContainer:0-param constructor");
	}
	 public void setBeanId(String beanId) {
			this.beanId = beanId;
		}

		public void setApplicationContext(ApplicationContext context) throws BeansException {
					this.context=context;
		}
		
	
	   public void processRequest(String data){
		    // get Depdent class obj using Depdency lookup
		   RequestHandler handler=context.getBean(beanId,RequestHandler.class);
	       handler.handle(data);
	       System.out.println("Request processing is completed");
	     }
	 }