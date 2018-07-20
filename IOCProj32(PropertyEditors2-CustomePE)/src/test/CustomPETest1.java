package test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.IntrAmtCalculator;
import com.nt.beans.IntrAmtDetails;
import com.nt.customPE.CustomIntrAmtDetailsEditor;


public class CustomPETest1 {

	public static void main(String[] args) {
		//create IOC container
		 ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Bean
		IntrAmtCalculator calculator=ctx.getBean("intrCalculator",IntrAmtCalculator.class);
		System.out.println("Intr Amt "+calculator.calcIntrAmt());
	}//main
}//class
