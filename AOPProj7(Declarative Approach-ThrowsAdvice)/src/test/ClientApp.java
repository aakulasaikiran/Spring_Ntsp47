package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.aspect.InValidInputsException;
import com.nt.target.PriceCalculator;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PriceCalculator proxy=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get proxy obj
		proxy=ctx.getBean("pfb",PriceCalculator.class);
		System.out.println("price "+proxy.calcPrice(200, 0));
	}
}
