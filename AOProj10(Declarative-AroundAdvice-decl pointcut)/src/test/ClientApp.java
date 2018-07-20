package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmtCalculator;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmtCalculator proxy=null;
		float intrAmt=0.0f;
		//create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Proxy obj
		  proxy=ctx.getBean("pfb",IntrAmtCalculator.class);
		 //Call Target method on proxy obj
		System.out.println("Simple Intrest amount:"+proxy.calcSimpleIntrAmt(50000, 20,2));
		System.out.println("Simple Intrest amount:"+proxy.calcSimpleIntrAmt(10000, 20,2));
		System.out.println("-----------------------------------------------");
		System.out.println("Compound Intrest amount:"+proxy.calcCompoundIntrAmt(10000, 20,2));
		System.out.println("Simple Intrest amount:"+proxy.calcSimpleIntrAmt(10000, 20,2));
		
		
	}
}
