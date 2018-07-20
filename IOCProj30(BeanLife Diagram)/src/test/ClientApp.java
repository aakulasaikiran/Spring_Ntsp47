package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.TestBean;

public class ClientApp {

	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		TestBean tb=ctx.getBean("tb",TestBean.class);
		
		
		((AbstractApplicationContext) ctx).close();

	}

}
