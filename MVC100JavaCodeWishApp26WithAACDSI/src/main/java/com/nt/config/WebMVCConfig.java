package com.nt.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.nt.controller")
@EnableWebMvc
public class WebMVCConfig {
	
	@Bean
	public HandlerMapping createHandlerMapping(){
		SimpleUrlHandlerMapping handlerMapping=null;
		Properties mappings=null;
		
		handlerMapping=new SimpleUrlHandlerMapping();
		
		mappings=new Properties();
		mappings.put("/home.htm","pvc1");
		
		handlerMapping.setMappings(mappings);
		
		return handlerMapping;
	}
	
	@Bean(name="pvc1")
	public Controller  createPVController(){
		ParameterizableViewController pvController=null;
		
		pvController=new ParameterizableViewController();
		pvController.setViewName("welcome");
		return pvController;
	}
	
	@Bean
	public  ViewResolver  createViewResolver(){
		InternalResourceViewResolver  viewResolver=null;
		viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/pages/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
		
	}

}
