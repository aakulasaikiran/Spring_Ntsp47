package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.FlipKart;

public class LCTest {

	public static void main(String[] args) {
		//create and activate IOC container
		BeanFactory factory=
				 new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		// Get Bean 
		FlipKart flipkart=factory.getBean("flipKart",FlipKart.class);
		// Use FlipKart Service
		flipkart.purchase(new String[]{"spring book"," fruits"});
	}
}
