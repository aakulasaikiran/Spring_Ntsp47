package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Voter;

public class AnnotationTest {

	public static void main(String[] args) {
	   //create IOC Container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
      Voter voter=ctx.getBean("voter",Voter.class);
		System.out.println(voter.checkVotingElgibility());
		
		((FileSystemXmlApplicationContext) ctx).close();
	}//main
}//class
