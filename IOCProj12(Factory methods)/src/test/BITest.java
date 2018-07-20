package test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

public class BITest {

	public static void main(String[] args) {
		//create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		// get Beans
		 Class clazz=factory.getBean("clazz",Class.class);
		 System.out.println(clazz+"--->"+clazz.getClass());
		 System.out.println("-------------------------------");
		 Calendar cl=factory.getBean("cal",Calendar.class);
		 System.out.println(cl+"---->"+cl.getClass());
		 System.out.println("-------------------------------");
		 String s1=factory.getBean("s1",String.class);
		System.out.println(s1+" ---->"+s1.getClass());		 
		System.out.println("-------------------------");
		String s2=factory.getBean("s2",String.class);
		System.out.println(s2+"------->"+s2.getClass());
		

	}

}
