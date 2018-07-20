package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.A;

public class CyclicTest {
	public static void main(String[] args) {
		//create IOC cotainer
		BeanFactory factory=new XmlBeanFactory(new 
				FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		A a=factory.getBean("a",A.class);
	}
	

}
