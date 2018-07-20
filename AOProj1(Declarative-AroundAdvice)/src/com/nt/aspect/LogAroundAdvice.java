package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		Object[] args=null;
		System.out.println(invocation.getMethod().getName()+"with args"+Arrays.toString(invocation.getArguments())+"is about to execute");
		//modify target method arg values
		args=invocation.getArguments();
		if(((Float)args[0])<=10000){
			args[2]=((Float)args[2])-1;
		}
		if((Float)args[0]>=0 && (Float)args[1]>=0 && (Float)args[2]>=0 )
		retVal=invocation.proceed();
		else
			retVal=0.0f;
		System.out.println(invocation.getMethod().getName()+"   with args"+Arrays.toString(invocation.getArguments())+"has completed execution");

		return (Float)retVal+((Float)retVal*0.1f);
	}

}
