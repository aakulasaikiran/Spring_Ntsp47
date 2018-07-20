package test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Viechle;

public class DLTest {
	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
/*		// getBean
		Viechle viechle=factory.getBean("viechle",Viechle.class);
		viechle.move();
		viechle.entertainment();
		viechle.soundHorn();
*/
		Viechle v1=factory.getBean("viechle",Viechle.class);
		Viechle v2=factory.getBean("viechle",Viechle.class);
		System.out.println(v1.hashCode()+"   "+v2.hashCode());
		System.out.println("v1==v2?"+(v1==v2));
		
	}
}
