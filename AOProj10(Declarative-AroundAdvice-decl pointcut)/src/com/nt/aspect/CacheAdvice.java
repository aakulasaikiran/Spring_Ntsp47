package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {
     private HashMap<String,Object>  cache=new HashMap<String,Object>();
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key=null;
		Object result=null;
		//prepare key having method name with args
		key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		//collection target method from cache if avaiable otherwise invoke target method
		if(cache.containsKey(key)){
			result=cache.get(key);
			System.out.println("CacheAdvice:from Cache");
		}
		else{
			result=invocation.proceed();  //call target mehtod
			cache.put(key, result);
			System.out.println("CacheAdvice:from target method");
		}
		return (Float)result;
	}//method

}//class
