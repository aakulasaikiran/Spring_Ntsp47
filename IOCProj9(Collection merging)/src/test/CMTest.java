package test;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.EnggCourse;

public class CMTest {

	public static void main(String[] args) {
		//Create IOC Cotainer
		BeanDefinitionRegistry factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
				//getBean
		 EnggCourse  course=((DefaultListableBeanFactory) factory).getBean("ECE1stYear",EnggCourse.class);
		System.out.println(course);

	}

}
