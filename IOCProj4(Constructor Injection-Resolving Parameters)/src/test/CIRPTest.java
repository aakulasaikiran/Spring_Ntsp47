package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Marks;

public class CIRPTest {
	public static void main(String[] args) {
		//Create IOC container
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Bean
		/*Student  st=factory.getBean("st",Student.class);
		System.out.println(st);*/
		//getBean
		Marks  mk=factory.getBean("mk",Marks.class);
		System.out.println(mk);
		
	}

}
