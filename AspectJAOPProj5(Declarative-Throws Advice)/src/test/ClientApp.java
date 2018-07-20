package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class ClientApp {

	public static void main(String[] args) {
	  ApplicationContext ctx=null;
	  com.nt.service.Math proxy=null;
		//Create IOC Container
	  ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	  //get Proxy obj
	  proxy=ctx.getBean("math",com.nt.service.Math.class);
	  //invoke method
	  System.out.println("Bill Amt"+proxy.div(200,0));
	  }//main
}//class
