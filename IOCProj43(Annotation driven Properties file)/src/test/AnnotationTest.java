package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.DBOperations;

public class AnnotationTest {

	public static void main(String[] args) {
	   //create IOC Container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
       DBOperations dbo=ctx.getBean("dbo",DBOperations.class);
       
       System.out.println(dbo.hashCode());
       System.out.println(dbo);
       System.out.println(dbo.getClass());
       
	}//main
}//class
