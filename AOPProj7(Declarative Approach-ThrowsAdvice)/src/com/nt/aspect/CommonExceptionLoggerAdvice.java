package com.nt.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class CommonExceptionLoggerAdvice implements ThrowsAdvice {
	
	public void  afterThrowing(Method method,Object[] args,Object target,Throwable e){
		System.out.println("1110");
		System.out.println("Exception is raised on"+method.getName()+
				                              "with args"+Arrays.toString(args)+
				                              	 " in the class"+target.getClass().getName());
		
	}
	
	/*public void  afterThrowing(Method method,Object[] args,Object target,Exception e){
		System.out.println("1111");
		System.out.println("Exception is raised on"+method.getName()+
				                              "with args"+Arrays.toString(args)+
				                              	 " in the class"+target.getClass().getName());
		
	}*/
	
	/*public void  afterThrowing(Exception e){
		System.out.println("1112");
		System.out.println("Exception  that is raised is"+e.getClass());
	}*/
	
	public void  afterThrowing(IllegalArgumentException e){
		System.out.println("1113");
		System.out.println("Exception  that is raised is"+e.getClass());
	}
	public void  afterThrowing(Method method,Object args[],Object target,IllegalArgumentException e){
		System.out.println("1114");
		System.out.println("Exception  that is raised is"+e.getClass());
	}

}
