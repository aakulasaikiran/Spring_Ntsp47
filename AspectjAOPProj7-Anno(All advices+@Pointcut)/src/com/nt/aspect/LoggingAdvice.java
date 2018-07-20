package com.nt.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAdvice{

@Pointcut(value="execution(* com.nt.service.*.*(..))")
public void myPointcut(){
}

@Around("myPointcut()")
@Order(1)
public Object log(ProceedingJoinPoint pjp)throws Throwable{
	Object retVal=null;
	System.out.println(pjp.getSignature()+"is entering....");
	retVal=pjp.proceed();
	System.out.println(pjp.getSignature()+"is existing....");
	return retVal;
   
}

@Before("myPointcut()")
@Order(2)
public void checkInputs(JoinPoint jp){
	Object args[]=null;
	System.out.println(jp.getSignature()+" is about to execute(Before Advice)");
	 args=jp.getArgs();
	 if((Integer)args[0]<=0 || (Integer)args[1]<=0)
		 throw new IllegalArgumentException("Inputs must not be zero");
}

@AfterReturning(value="myPointcut()",returning="result")
public void checkResult(JoinPoint jp,int result){
	System.out.println(jp.getSignature()+" has completed execution(After Advice)");
	if(result<=0)
		 throw new IllegalArgumentException("Bad results");
}

@AfterThrowing(value="myPointcut()",throwing="e")
public void logException(JoinPoint jp,Exception e){
	System.out.println("exception detials"+e.toString());

 }
}

