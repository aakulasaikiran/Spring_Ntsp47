package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.FindScoreService;




public class ServiceLocatorTest {

	public static void main(String[] args) {
		//create IOC container
		 ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get Bean
		 FindScoreService service=ctx.getBean("service",FindScoreService.class);
        String score=service.viewScore(1001);
        System.out.println("Score Card:"+score);
 	}//main
}//class
