package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.IntrAmtCalculator;

public class MethodReplacerTest {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		IntrAmtCalculator  calc=ctx.getBean("iac",IntrAmtCalculator.class);
		System.out.println("Intr amout"+calc.calcIntrAmt(20000,34));
		System.out.println(calc.getClass());
	}
}
