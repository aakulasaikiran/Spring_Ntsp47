package com.nt.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Voter {
	private String name;
	private int age;
	private String addrs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String  checkVotingElgibility(){
		if(age>=18)
			return name+" u r elgible to vote";
		else
			return  name+"u r not elgible to vote";
	}//mehtod
	
	@PostConstruct
	public void myInit(){
		System.out.println("Voter:myInit()");
		if(name==null || age<=0)
			throw new IllegalArgumentException("name,age properties are required");
	}
	
	@PreDestroy
	public void myDestroy(){
		System.out.println("Voter:myDestroy()");
		name=null;
		age=0;
		addrs=null;
	}
}//class
