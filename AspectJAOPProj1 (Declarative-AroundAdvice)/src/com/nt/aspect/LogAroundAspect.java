package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAroundAspect {
	
	public  Object log(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		Object args[]=null;
		System.out.println(pjp.getSignature().getName()+"with args"+Arrays.toString(pjp.getArgs())+" is about to execute");
		args=pjp.getArgs();
		if((Float)args[0]<=50000){
			args[2]=(Float)args[2]-0.5f;
		}
		retVal=pjp.proceed(args);
		System.out.println(pjp.getSignature().getName()+"with args"+Arrays.toString(pjp.getArgs())+" has completed the execution");
		return retVal;
	}

}
