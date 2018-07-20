package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext context=null;
        com.nt.service.Math proxy=null;
		//create IOC container
		context=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Proxy obj
		 proxy=context.getBean("math",com.nt.service.Math.class);
		// call methods
		 System.out.println("Add ="+proxy.add(10,20));
		 System.out.println("Sub="+proxy.sub(10,5));
		 System.out.println("mul="+proxy.mul(30, 40));
		 System.out.println("Div="+proxy.div(45, 0));
		
	}//main
}//class
