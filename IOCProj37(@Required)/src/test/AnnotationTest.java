package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Robot;

public class AnnotationTest {

	public static void main(String[] args) {
	   //create IOC Container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		Robot robo=ctx.getBean("robot",Robot.class);
		System.out.println(robo);
	}//main
}//class
