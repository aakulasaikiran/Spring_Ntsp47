package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.FileSystemResource;

public class WebContainer{
	 private RequestHandler handler;
	 public WebContainer() {
	  System.out.println("webContainer:0-param constructor");
	}
	  public void setHandler(RequestHandler handler){
	      this.handler=handler;
	    }
	   public void processRequest(String data){
	      handler.handle(data);
	      System.out.println("WebContainer: processRequest(-) is completed");
	     }
	 }