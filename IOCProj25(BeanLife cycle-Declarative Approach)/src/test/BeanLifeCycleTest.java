package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Voter;

public class BeanLifeCycleTest {
	public static void main(String[] args) {
		//create IOC container
		ApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		 Voter voter=ctx.getBean("voter",Voter.class);
		System.out.println(voter.checkVotingElgibility());
		
		 //close container
		 ((AbstractApplicationContext) ctx).close();
		   
	}
}
