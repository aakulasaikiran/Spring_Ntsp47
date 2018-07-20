package com.nt.beans;
public class A {
	private B b;	

	private A(){
		System.out.println("A:0-param constructor");
	}
	public A(B b){
		this.b=b;
		System.out.println("A: 1 -param constructor");
		
	}

	public void setB(B b) {
		System.out.println("A: setB(-)");
		this.b = b;
	}

	
}
