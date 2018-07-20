package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PAndCNameSpaceTest {
	public static void main(String[] args) {
		//create IOC cotainer
		/*DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml")); 
		*/
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		
		ctx.getBean("dept");
	/*	//get Bean
		 Emp emp=ctx.getBean("emp",Emp.class);
		System.out.println(emp);*/
	}
}
