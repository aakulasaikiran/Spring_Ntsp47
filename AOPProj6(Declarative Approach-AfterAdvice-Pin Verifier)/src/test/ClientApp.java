package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ATMPinGenerator;

public class ClientApp {

	public static void main(String[] args) {
	  ApplicationContext ctx=null;
	  ATMPinGenerator  proxy=null;
		//Create IOC Container
	  ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	  //get Proxy obj
	  proxy=ctx.getBean("pfb",ATMPinGenerator.class);
	  //invoke method
	  System.out.println("ATM Pin"+proxy.generatePin());
	}//main
}//class
