package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SecurityCheckAdvice  implements MethodBeforeAdvice {
  
private AuthenticationServiceManager  asm;

public void setAsm(AuthenticationServiceManager asm) {
	this.asm = asm;
}
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
      boolean status=false;
      //peform security check(Authentication)
      status=asm.authenticate();
      if(!status)
    	  throw new IllegalAccessException("InValid Credentials are given");
		
	}//before(-,-,-)
}//class
