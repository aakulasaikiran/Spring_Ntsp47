package com.nt.service;

import org.springframework.stereotype.Service;

@Service("math")
public class Math {
	
	public int add(int x,int y){
		return x+y;
	}
	
	public int sub(int x,int y){
		return x-y;
	}
	public int mul(int x,int y){
		return x*y;
	}
	public float div(int x,int y){
		if(y==0)
			throw new IllegalArgumentException("Invalid inputs");
		return (float)x/y;
	}

}
