package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.College;
import com.nt.beans.FruitStore;
import com.nt.beans.MobileNetworkProvider;
import com.nt.beans.MultiMedia;
import com.nt.beans.University;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		//Create IOC container
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
	   //Get Bean
		MultiMedia mm=factory.getBean("mm",MultiMedia.class);
		System.out.println(mm);
		//Get Bean
		College clg=factory.getBean("clg",College.class);
		System.out.println(clg);
		
		MobileNetworkProvider mnp=factory.getBean("mnp",MobileNetworkProvider.class);
		System.out.println(mnp);
		
		University uni=factory.getBean("uni",University.class);
		System.out.println(uni);
		
		FruitStore store=factory.getBean("store",FruitStore.class);
		System.out.println(store);
		

	}

}
