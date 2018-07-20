package test;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.controller.StudentController;

public class ClientApp {
   public static void main(String[] args) {
	/*   ApplicationContext ctx=null;
	      StudentController controller=null;
	   String result=null;
	   // create IOC Container 
	    ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	   //Get Controller Bean
	    controller=ctx.getBean("stController",StudentController.class);
	   // Call method
	   result=controller.process("1285", "ravi","45","43","55");
	   System.out.println(result); */
	   
		//create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
	    // Access PropertyPlaceholderConfigurer (BeanFactoryPostProcessor)
		PropertyPlaceholderConfigurer pphc=factory.getBean("pphc",PropertyPlaceholderConfigurer.class);
		 //register BeanFactoryPostProcessor
		pphc.postProcessBeanFactory(factory);
		
		// getBean
		  StudentController controller=factory.getBean("stController",StudentController.class);
		  String result=controller.process("1286", "ravi","45","43","55");
		   System.out.println(result);
		  
		
	   
	   
  }//main
}//class

