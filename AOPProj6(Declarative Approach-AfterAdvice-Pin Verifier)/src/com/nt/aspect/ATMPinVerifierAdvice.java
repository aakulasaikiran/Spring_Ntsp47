package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ATMPinVerifierAdvice implements AfterReturningAdvice {
	
	@Override
	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
		
		if((Integer)retVal<=999 || (Integer)retVal>9999){
			throw new IllegalArgumentException("Invalid Pin Generated:::"+retVal);
		}
		
	}

}
