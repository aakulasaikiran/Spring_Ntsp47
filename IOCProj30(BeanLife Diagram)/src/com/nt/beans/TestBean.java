package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestBean implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{
  private String message;

  public void setMessage(String message) {
	  System.out.println("TestBean:setMessage(-)");
	this.message = message;
}
	public TestBean() {
		System.out.println("TestBean:0-patam cosntructor");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("TestBean:destory()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("TestBean:afterPropertiesSet()");
		
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("TestBean:setApplicationContext(-)");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("TestBean:setBeanFactory(-)");
		
	}

	@Override
	public void setBeanName(String name) {
	    System.out.println("TestBean:setBeanName(-)");
	}
	public void myInit(){
		System.out.println("TestBean:myInit()");
	}
	public void myDestroy(){
		System.out.println("TestBean:myDestroy()");
	}

}
