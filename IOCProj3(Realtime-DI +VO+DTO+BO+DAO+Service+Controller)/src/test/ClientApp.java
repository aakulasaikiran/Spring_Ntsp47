package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.StudentController;

public class ClientApp {
   public static void main(String[] args) {
	   BeanFactory factory=null;
	   StudentController controller=null;
	   String result=null;
	   // create IOC Container 
	    factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	   //Get Controller Bean
	    controller=factory.getBean("stController",StudentController.class);
	   // Call method
	   result=controller.process("107", "ravi","45","43","55");
	   System.out.println(result);
  }//main
}//class

