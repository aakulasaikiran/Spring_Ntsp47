package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Viechle;

public class AnnotationTest {

	public static void main(String[] args) {
	   //create IOC Container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
      Viechle viechle=ctx.getBean("viechle",Viechle.class);
		System.out.println(viechle);
	}//main
}//class
