package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.StudentService;

public class ClientApp {

	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	   // get bean
		StudentService service=ctx.getBean("stService",StudentService.class);
		// call method
		System.out.println("111 student details"+service.findStudentDetails(111));
	}
}
