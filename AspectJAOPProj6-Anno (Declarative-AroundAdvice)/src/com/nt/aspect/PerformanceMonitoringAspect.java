package com.nt.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class PerformanceMonitoringAspect {
	private long start,end;
	
	  @Around("execution(* com.nt.service.*.calcCompoundIntrAmt(..))")
	public  Object monitor(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		start=System.currentTimeMillis();
		retVal=pjp.proceed();
		end=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" has taken "+(end-start)+" ms time to finish the execution");
		return retVal;
	}

}
