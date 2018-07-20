package com.nt.aspect;

import org.aspectj.lang.JoinPoint;

public class CommonExceptionLogger {
	
	public void  exceptionLogger(JoinPoint jp,ArithmeticException ae){
		
		System.out.println(ae.toString()+"exception is in "+jp.getSignature()+ "mehtod");
		
	}

}
