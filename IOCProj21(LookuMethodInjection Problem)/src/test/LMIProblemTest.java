package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.WebContainer;

public class LMIProblemTest {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		WebContainer container=ctx.getBean("container",WebContainer.class);
		   container.processRequest("hello");
		   container.processRequest("hai");
		  WebContainer container1=ctx.getBean("container",WebContainer.class);
		  container1.processRequest("hello");
		   container1.processRequest("hai");
		  
		   
	}
}
