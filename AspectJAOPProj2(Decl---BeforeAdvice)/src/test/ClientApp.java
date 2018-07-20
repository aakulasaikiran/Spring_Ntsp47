package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.OrderApprover;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext context=null;
		OrderApprover proxy=null;
		//create IOC container
		context=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Proxy obj
		 proxy=context.getBean("orderApprover",OrderApprover.class);
		// call methods
		 System.out.println("Order is Approved?"+proxy.approveOrder(1001));
		 
	}//main
}//class
