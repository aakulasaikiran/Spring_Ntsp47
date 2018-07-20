package com.nt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Voter implements InitializingBean,DisposableBean{
private String name;
private String addrs;
private int age;

public Voter() {
	System.out.println("Voter:0-param constructor");
}
//setter methods for setter injection
 

public void setName(String name) {
	System.out.println("Voter:setName(-)");
	this.name = name;
}


public void setAddrs(String addrs) {
	System.out.println("Voter:setAddrs(-)");
	this.addrs = addrs;
	
}


public void setAge(int age) {
	System.out.println("Voter:setAge(-)");
	this.age = age;
}

public String checkVotingElgibility(){
        if(age>=18)
          return name+" you are elgible to vote";
       else
          return name+" you are not elgible to vote";
   }
@Override
public void destroy() throws Exception{
	System.out.println("Voter:destroy()");
	  name=null;
	     addrs=null;
	     age=0;
	
}
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Voter:afterPropertiesSet()");
	 if(age<=0 || name==null)
         throw new IllegalArgumentException(" pls cfg proper dependent values");
	
}

/*public void myInit(){
	System.out.println("Voter:myInit()");
     if(age<=0 || name==null)
          throw new IllegalArgumentException(" pls cfg proper dependent values");
  }
public void myDestroy(){
	System.out.println("Voter:myDestroy()");
     name=null;
     addrs=null;
     age=0;
  }*/

 }
