package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmtCalculatorInterface;

public class ClientApp {
	public static void main(String[] args) {
		ApplicationContext context=null;
		IntrAmtCalculatorInterface proxy=null;
		//create IOC container
		context=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Proxy obj
		 proxy=context.getBean("iac",IntrAmtCalculatorInterface.class);
		// call methods
		 System.out.println("Simple intr Amount"+proxy.calcSimpleIntrAmt(10000,10, 2));
		 System.out.println("......................................");
		 System.out.println("Simple intr Amount"+proxy.calcSimpleIntrAmt(10000,10, 2));
		 
		 System.out.println("------------------------------------------------------");
		 System.out.println("Compound intr Amount"+proxy.calcCompoundIntrAmt(10000,10, 2));
		 System.out.println(".......................................");
		 System.out.println("Compound intr Amount"+proxy.calcCompoundIntrAmt(10000,10, 2));
		 
		 System.out.println("proxy obj class"+proxy.getClass());
	}//main
}//class
