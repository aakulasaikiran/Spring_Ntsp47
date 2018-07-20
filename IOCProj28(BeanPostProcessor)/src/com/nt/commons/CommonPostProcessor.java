package com.nt.commons;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.BaseBO;

public class CommonPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanId) throws BeansException {
		System.out.println("CommonPostProcessor:postProcessBeforeInitialization");
		if(bean instanceof BaseBO){
			((BaseBO)bean).setDoj(new Date());
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanId) throws BeansException {
		System.out.println("CommonPostProcessor:postProcessAfterInitialization");
		return bean;
	}

}
