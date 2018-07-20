package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class AwareInjectionTest {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext context=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		Viechle viechle=context.getBean("viechle",Viechle.class);
		//Call b.method
		viechle.move();
		viechle.entertainment();
		viechle.soundHorn();
		
		
	}
}
