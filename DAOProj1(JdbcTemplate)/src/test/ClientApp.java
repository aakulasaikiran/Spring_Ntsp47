package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.DBOperationsService;

public class ClientApp {

	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Service class
		DBOperationsService  service=ctx.getBean("DBService",DBOperationsService.class);
       // perform persistence operations
		//System.out.println(service.registerEmp(007,"ramesh","clerk",900));
		//System.out.println("Emp Salary"+service.showSalary(7499));
		//System.out.println("hike Emp salary by 10%"+service.hikeSalary(7499,10));
		//System.out.println("Emp Salary"+service.showSalary(7499));
		//System.out.println("7499 Emp Details"+service.getEmpDetails(7499));
		System.out.println("All Emp Details are"+service.getAllEmpDetails(007));
		//System.out.println("Fire Emp"+service.fireEmp(1));
		
	}

}
