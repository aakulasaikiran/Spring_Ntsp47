package test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.IntrAmtCalculatorInterface;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmtCalculatorInterface proxy=null;
		float intrAmt=0.0f;
		//create IOC container
		 ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Proxy obj
		  proxy=ctx.getBean("pfb",IntrAmtCalculatorInterface.class);
		 //Call Target method on proxy obj
		System.out.println("Intrest amount:"+proxy.calcIntrAmt(10000, 20,2));
		System.out.println("------------------------------------------------");
		System.out.println("Intrest amount:"+proxy.calcIntrAmt(10000, 20,2));
		System.out.println("------------------------------------------------------------");
		System.out.println("Intrest amount:"+proxy.calcIntrAmt(10000, 20,3));
		System.out.println(proxy.getClass()+" ---->"+Arrays.toString(proxy.getClass().getInterfaces()));
		
	}
}
