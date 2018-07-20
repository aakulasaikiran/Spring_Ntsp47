package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class AnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Viechle viechle=null;
	   //create IOC Container
	 ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
      viechle=ctx.getBean("viechle",Viechle.class);
		System.out.println(viechle);
	}//main
}//class
