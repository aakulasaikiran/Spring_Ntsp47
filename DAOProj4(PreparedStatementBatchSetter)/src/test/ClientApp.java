package test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.RegisterStudentsService;

public class ClientApp {

	public static void main(String[] args) {
		StudentDTO dto1=null,dto2=null;
		List<StudentDTO> listDTO=null;
	//create IOC Container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
	RegisterStudentsService service=ctx.getBean("regService",RegisterStudentsService.class);
	 // prepare ListDTO having inputs
	 dto1=new StudentDTO();
	 dto1.setSno(101); dto1.setSname("raja"); dto1.setSadd("hyd");
	 dto2=new StudentDTO();
	dto2.setSno(102); dto2.setSname("ravi"); dto2.setSadd("vizag");
	 listDTO=new ArrayList<StudentDTO>();
	 listDTO.add(dto1); listDTO.add(dto2);
	 //call method
	 String resultMsg=service.registerStudents(listDTO);
	 System.out.println(resultMsg);
	}

}
