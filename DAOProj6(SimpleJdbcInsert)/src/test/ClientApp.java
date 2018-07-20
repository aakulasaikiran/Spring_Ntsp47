package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class ClientApp {

	public static void main(String[] args) {
	   ApplicationContext ctx=null;
	   StudentService service=null;
	   StudentDTO dto=null;
	   //create IOC contaner
	   ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
	   //get Bean
	   service=ctx.getBean("stService",StudentService.class);
	   // create DTO class obj
	   dto=new StudentDTO();
	   dto.setSno(112); dto.setSname("rajesh"); dto.setSadd("hyd");
	   //call method
	   System.out.println(service.registerStudent(dto));
	}//main
}//class

