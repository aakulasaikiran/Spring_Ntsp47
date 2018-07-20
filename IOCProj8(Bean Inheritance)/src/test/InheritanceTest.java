package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Bike;

public class InheritanceTest {

	public static void main(String[] args) {
		//Create IOC Cotainer
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//getBean
		 Bike  bike=factory.getBean("basePulsor",Bike.class);
		System.out.println(bike);

	}

}
