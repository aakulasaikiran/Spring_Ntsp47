package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Remote;
import com.nt.beans.TV;

public class InnertBeanTest {
	public static void main(String[] args) {
		//create IOC cotainer
		BeanFactory factory=new XmlBeanFactory(new 
				FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		TV  tv=factory.getBean("com.nt.beans.TV#0",TV.class);
		System.out.println(tv);
		
		TV tv1=factory.getBean("com.nt.beans.TV#1",TV.class);
		System.out.println(tv1);
	
	}
	

}
