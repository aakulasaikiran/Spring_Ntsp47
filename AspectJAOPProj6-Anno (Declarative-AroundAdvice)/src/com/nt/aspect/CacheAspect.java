package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class CacheAspect {
    private HashMap<String,Object> cache=new HashMap<String,Object>();
	
    @Around("execution(* com.nt.service.*.calcCompoundIntrAmt(..))")
	public  Object  caching(ProceedingJoinPoint pjp)throws Throwable{
		String key=null;
		Object retVal=null;
		key=pjp.getSignature().getName()+Arrays.toString(pjp.getArgs());
		if(!cache.containsKey(key)){
			retVal=pjp.proceed();
			cache.put(key,retVal);
			System.out.println("From Target method");
			return retVal;
		}
		else{
			System.out.println("From cache");
			return cache.get(key);
		}
	}//caching
}//class
