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
		System.out.println("Intrest amount:"+proxy.calcIntrAmt(10000, 20,2));
		System.out.println("Intrest amount:"+proxy.calcIntrAmt(10000, 20,2));
		System.out.println("------------------------------------------------------------");
		System.out.println("Intrest amount:"+proxy.calcIntrAmt(10000, 20,3));
		System.out.println(proxy.getClass()+" ---->"+proxy.getClass().getSuperclass());
		
	}
}
