package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.AdharDetails;


public class PETest {

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Bean
		AdharDetails details=ctx.getBean("adhar",AdharDetails.class);
		System.out.println(details);
	}

}
