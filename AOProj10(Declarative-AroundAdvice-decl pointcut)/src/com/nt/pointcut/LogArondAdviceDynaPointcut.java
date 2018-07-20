package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.nt.service.IntrAmtCalculator;

public class LogArondAdviceDynaPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clazz, Object[] args) {
		if(clazz==IntrAmtCalculator.class && (method.getName().equals("calcSimpleIntrAmt")
				 ||method.getName().equals("calcCompoundIntrAmt")) && (Float)args[0]>=50000)
  		return true;
  		else
  		return false;
  }//method
}//class
