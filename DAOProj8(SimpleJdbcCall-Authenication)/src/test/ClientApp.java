package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.LoginService;

public class ClientApp {

	public static void main(String[] args) {
	    ApplicationContext ctx=null;
	    LoginService service=null;
	    //create IOC Container
	    ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	    // get SErvice Bean
	    service=ctx.getBean("loginService",LoginService.class);
	    //call method
	    System.out.println("Result::::"+service.login("raja","rani"));
	}
}
