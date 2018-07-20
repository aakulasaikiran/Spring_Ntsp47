package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class ClientApp {

	public static void main(String[] args) {
	   //create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Service Bean
		EmployeeService service=ctx.getBean("empService",EmployeeService.class);
		//call methods
       System.out.println("7499 Emp name::: "+service.searchEmpNameByNo(7499));
       System.out.println("7499 Emp Details::: "+service.searchEmpDetailsByNo(7499));
        
       EmployeeDTO dto=new EmployeeDTO();
        dto.setEno(1001); dto.setEname("raja"); dto.setJob("clerk"); dto.setSalary(8000);
       System.out.println("Emp Registered?"+service.registerEmp(dto)); 
	}//main
}//class
