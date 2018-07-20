package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ShoppingStore;

public class ClientApp {

	public static void main(String[] args) {
	  ApplicationContext ctx=null;
	  ShoppingStore  proxy=null;
		//Create IOC Container
	  ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	  //get Proxy obj
	  proxy=ctx.getBean("pfb",ShoppingStore.class);
	  //invoke method
	  System.out.println("Bill Amt"+proxy.purchase(new String[]{"shirt1", "shirt2"},30000));
	}//main
}//class
