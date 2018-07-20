package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.LoanApprover;

public class NestedFactoriesTest {
	public static void main(String[] args) {
		//create Parent IOC Container
		/* BeanFactory parentFactory=
		    new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/loan-details-beans.xml"));
		  //create Child IOC Container
		 BeanFactory childFactory=
		    new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/loan-approve-beans.xml"),parentFactory); */
		//create Parent IOC container
		DefaultListableBeanFactory parentFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(parentFactory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/loan-details-beans.xml"));
		//create Child IOC container
		DefaultListableBeanFactory childFactory = new DefaultListableBeanFactory(parentFactory);
		 reader = new XmlBeanDefinitionReader(childFactory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/loan-approve-beans.xml"));
		
		
		
		 //getBean
		  LoanApprover approver=childFactory.getBean("approver",LoanApprover.class);
		  // call b.method
		  System.out.println(approver.approveLoan());
	
	}

}
