package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class LMITest {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
         //getBean		
		Viechle viechle=ctx.getBean("viechle",Viechle.class);
		viechle.move();
		viechle.entertainment();
		viechle.soundHorn();
		System.out.println("bean class"+viechle.getClass());
		System.out.println("bean super class"+viechle.getClass().getSuperclass());
		
	}
}
