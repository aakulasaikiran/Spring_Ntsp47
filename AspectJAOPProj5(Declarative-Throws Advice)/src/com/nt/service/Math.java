package com.nt.service;

public class Math {
	
	public float div(int x, int y){
		float result=0.0f;
		
		if(y==0)
			throw new ArithmeticException(" divider can not be Zero");
				
		result=(float)x/y;
		return result;
		
	}

}
