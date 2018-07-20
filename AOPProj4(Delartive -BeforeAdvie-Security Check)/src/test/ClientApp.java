package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.aspect.AuthenticationServiceManager;
import com.nt.service.IntrAmtCalculator;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticationServiceManager service=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// getBean (AuthenticationServiceManager)
		service=ctx.getBean("amService",AuthenticationServiceManager.class);
		// perform singnIn operation
		service.singnIn("raja","rani");
		// get Proxy obj
		IntrAmtCalculator proxy=ctx.getBean("pfb",IntrAmtCalculator.class);
		//Call target method
		System.out.println("Intr Amt::"+proxy.calcIntrAmt(20000, 2, 20));
		//perform signout
		service.signOut();
	}
}
