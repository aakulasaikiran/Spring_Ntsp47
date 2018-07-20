package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(3)
@Component
public class LogAroundAspect {
	
	  @Around("execution(* com.nt.service.*.*(..))")
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
