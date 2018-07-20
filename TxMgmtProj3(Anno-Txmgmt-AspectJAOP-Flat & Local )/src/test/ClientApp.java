package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.BankService;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService tProxy=null;
		boolean status=false;
		//create IOCContainer
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get Bean
		tProxy=ctx.getBean("bankService",BankService.class);
		//Call b.methods
		try{
		status=tProxy.transferMoney(1002,1005,20000);
		if(status)
			 System.out.println("Money transfered (Tx Committed)");
		else
			 System.out.println("Money not transfered (Tx Rolledback)");
		}
		catch(Exception e){
			System.out.println("Money not transfered(Tx rolled back)");
			e.printStackTrace();
		}
		
	}//main
}//class
