package com.nt.aspect;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class AuditingAspect {
	
	public  void   auditing(JoinPoint jp,int oid)throws Throwable{
		int orderId=0;
		FileWriter writer=null;
		//get Argument value
	/*	orderId=(Integer)jp.getArgs()[0];
		orderId=orderId+100;*/
		orderId=oid;
		System.out.println("target method name"+jp.getSignature());
		System.out.println("target method args"+Arrays.toString(jp.getArgs()));
		
		//write auditing info to log file
		writer=new FileWriter("e:\\spring\\audit.log",true);
		writer.write(orderId +" has come approval at "+ new Date());
        writer.flush();
        writer.close();
	}

}
