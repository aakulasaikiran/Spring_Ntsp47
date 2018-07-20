package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentService  service=null;
		StudentDTO dto=null;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Service Bean
          service=ctx.getBean("stService",StudentService.class);
          // call b.method
          dto=new StudentDTO();
          dto.setSno(101); dto.setSname("rajesh"); dto.setSadd("hyd");
          System.out.println(service.modifyStudentDetails(dto));
	}//main
}//class
