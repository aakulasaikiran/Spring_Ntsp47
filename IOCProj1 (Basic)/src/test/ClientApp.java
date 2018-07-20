package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishGenerator;

public class ClientApp {
	public static void main(String[] args) {
		//Locate Spring Bean cfg file
		Resource res=new  FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		//create and activate IOC cotainer
		BeanFactory factory=new XmlBeanFactory(res);
		
		WishGenerator bean=factory.getBean("wish",WishGenerator.class);
		
		System.out.println("Wish Message :"+bean.generateWishMsg("raja")); 
	
	}

}
