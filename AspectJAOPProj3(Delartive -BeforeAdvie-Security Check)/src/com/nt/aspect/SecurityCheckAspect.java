package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SecurityCheckAspect {
  
private AuthenticationServiceManager  asm;

public void setAsm(AuthenticationServiceManager asm) {
	this.asm = asm;
}

	public void securityCheck()throws Throwable{
      boolean status=false;
      //peform security check(Authentication)
      status=asm.authenticate();
      if(!status)
    	  throw new IllegalAccessException("InValid Credentials are given");
	 }//securityCheck()
	}//class
