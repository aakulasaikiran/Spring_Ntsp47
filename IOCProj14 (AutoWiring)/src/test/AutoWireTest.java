package test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.TravelAgent;

public class AutoWireTest {
	public static void main(String[] args) {
		//IOC container
		DefaultListableBeanFactory factory =null;
		XmlBeanDefinitionReader reader=null;
			factory= new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));

		//Get Bean
		TravelAgent agent=factory.getBean("agent",TravelAgent.class);
		
		System.out.println(agent); 
	
	}

}
