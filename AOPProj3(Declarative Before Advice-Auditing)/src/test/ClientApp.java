package test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.OrderApprover;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		float intrAmt=0.0f;
		OrderApprover proxy=null;
		//create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Proxy obj
		  proxy=ctx.getBean("pfb",OrderApprover.class);
		 //Call Target method on proxy obj
		System.out.println(proxy.approveOrder(1002));
	}//method
}//class
