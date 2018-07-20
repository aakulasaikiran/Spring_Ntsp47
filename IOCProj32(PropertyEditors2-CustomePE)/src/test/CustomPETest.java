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


public class CustomPETest {

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		
		((ConfigurableListableBeanFactory)factory).addPropertyEditorRegistrar(new  CustomPropertyEditorRegistar());
		  
		// get Bean
		IntrAmtCalculator calculator=factory.getBean("intrCalculator",IntrAmtCalculator.class);
		System.out.println("Intr Amt "+calculator.calcIntrAmt());
	}//main
	
	private static class CustomPropertyEditorRegistar implements PropertyEditorRegistrar{

		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
			registry.registerCustomEditor(IntrAmtDetails.class,new CustomIntrAmtDetailsEditor());
		}
	}
	
}//class
