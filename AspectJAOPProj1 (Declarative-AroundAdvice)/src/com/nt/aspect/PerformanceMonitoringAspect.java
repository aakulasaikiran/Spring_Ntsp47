package com.nt.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAspect {
	private long start,end;
	public  Object monitor(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		start=System.currentTimeMillis();
		retVal=pjp.proceed();
		end=System.currentTimeMillis();
		System.out.println(pjp.getSignature()+" has taken "+(end-start)+" ms time to finish the execution");
		return retVal;
	}

}
