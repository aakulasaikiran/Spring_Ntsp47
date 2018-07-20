package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.service.AccountService;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AccountService proxy=null;
		boolean status=false;
		//create IOC container
		ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		// get bean
		proxy=ctx.getBean("accountService",AccountService.class);
		//Call b.method
		try{
			 status=proxy.transferMoney(1004,1003 ,2000);
			 if(status){
				 System.out.println("Money Transfered(Tx committed)");
			 }
			 else{
				 System.out.println("Money not Transfered(Tx rolledback)");
			 }
		}//try
		catch(Exception se){
			se.printStackTrace();
		}
		
	}//main
}//class

