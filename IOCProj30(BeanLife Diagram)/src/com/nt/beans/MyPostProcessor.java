package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
     System.out.println("MyPostProcessor:postProcesBeforeInitialization(-,-)");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("MyPostProcessor:postProcesafterInitialization(-,-)");
		return bean;
	}

}
