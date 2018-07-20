package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.ScheduleRemainder;



public class FactoryBeanTest {

	public static void main(String[] args) {
		//create IOC container
		 ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Bean
		 ScheduleRemainder remainder=ctx.getBean("remainder",ScheduleRemainder.class);
		 remainder.remainer();
		 System.out.println(remainder);
	}//main
}//class
