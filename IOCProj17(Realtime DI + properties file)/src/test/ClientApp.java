package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.controller.StudentController;

public class ClientApp {
   public static void main(String[] args) {
	   ApplicationContext ctx=null;
	      StudentController controller=null;
	   String result=null;
	   // create IOC Container 
	    ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	   //Get Controller Bean
	    controller=ctx.getBean("stController",StudentController.class);
	   // Call method
	   result=controller.process("1255", "ravi","45","43","55");
	   System.out.println(result);
  }//main
}//class

