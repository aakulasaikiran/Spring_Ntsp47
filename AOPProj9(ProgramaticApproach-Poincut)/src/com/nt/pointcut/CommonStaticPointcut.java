package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.nt.service.ArithmeticService;

public class CommonStaticPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clazz) {
		if(clazz==ArithmeticService.class && method.getName().equals("sum"))
        return true;
        else
		return false;
	}
}
