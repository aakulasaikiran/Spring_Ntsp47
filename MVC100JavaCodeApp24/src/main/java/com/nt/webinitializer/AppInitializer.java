package com.nt.webinitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.config.RootConfig;
import com.nt.config.WebMVCConfig;

public class AppInitializer implements WebApplicationInitializer{

 public   void onStartup(ServletContext  context){
	 System.out.println("AppInitializer::: onStartUp(-) method");
  AnnotationConfigWebApplicationContext rootCtx=null;
  ContextLoaderListener listener=null;
  AnnotationConfigWebApplicationContext webCtx=null;
  // Create RootApplicationContext container
   rootCtx=new AnnotationConfigWebApplicationContext();
   rootCtx.register(RootConfig.class);
  //Link root context with ContextLoaderListener
   listener=new ContextLoaderListener(rootCtx);
   //add Listener
   context.addListener(listener);

    // Create WebApplicationContext container
 webCtx=new AnnotationConfigWebApplicationContext();
  webCtx.register(WebMVCConfig.class);
   DispatcherServlet servlet=new DispatcherServlet(webCtx);
ServletRegistration.Dynamic registration =context.addServlet("dispatcher", servlet);
     registration.setLoadOnStartup(2);
       registration.addMapping("*.htm");
   }
}