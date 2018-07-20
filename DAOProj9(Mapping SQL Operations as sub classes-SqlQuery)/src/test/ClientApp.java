package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.StudentService;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService  service=null; 
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Service Bean
          service=ctx.getBean("stService",StudentService.class);
          // call b.method
          System.out.println("Students beloging to hyd address"+service.searchStudentsByAddrs("hyd"));
          
	}

}
