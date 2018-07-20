package com.nt.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class AuditingAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		 FileWriter writer=null;
		System.out.println("target method name"+method.getName());
		System.out.println("taget method args"+Arrays.toString(args));
		System.out.println("taget class  name"+target.getClass());
		//write audit info to log file
		writer =new FileWriter("e:\\spring\\audit.log",true);
		writer.write("\n"+args[0]+"(order id) order has come for approval on date"+new Date());
		writer.flush();
		writer.close();
	}//before(-,-,-)
}//class
