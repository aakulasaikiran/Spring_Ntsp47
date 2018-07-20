package test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.commons.CommonPostProcessor;
import com.nt.service.StudCustService;

public class BPPTest {
	
	public static void main(String[] args) {
		//create IOC Container
	//	ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		//registering bean postprocessor with BeanFactory
		CommonPostProcessor cbpp=new CommonPostProcessor();
		factory.addBeanPostProcessor(cbpp);
		
		//get Bean 
		StudCustService service=factory.getBean("service",StudCustService.class);
		//call b.methods
		service.processStudent(101, "Raja","java");
		service.processStudent(102, "ravi","java");
		
		service.processCustomer(103, "jani",43445);
		service.processCustomer(104,"pavan",4344);
		
		
		
		
	}

}
