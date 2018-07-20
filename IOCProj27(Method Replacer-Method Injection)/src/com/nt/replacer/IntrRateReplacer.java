package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("IntrRateReplacer: reimplement(-,-,-)");
		float pAmt=(Float)args[0];
		float time=(Float)args[1];
		return  (pAmt*time*1.0f/100.0f);
	}

}
