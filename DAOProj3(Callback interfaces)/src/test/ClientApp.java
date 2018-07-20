package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.ListEmpService;

public class ClientApp {

	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Service Bean
		ListEmpService service = ctx.getBean("empService", ListEmpService.class);
		// call methods
		System.out.println("Emp Details" + service.searchEmpByNo(1));
		System.out.println("clerk desg Emp Details" + service.searchEmpByDesg("manager"));

	}// main
}// class
