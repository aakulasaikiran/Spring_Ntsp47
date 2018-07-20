package com.nt.service;

public  class IntrAmtCalculator implements IntrAmtCalculatorInterface{

	public  float calcIntrAmt(float pAmt,float time,float rate ){
		System.out.println("IntrAmtCalculator:calcIntrAmt(-,-,-)");
		return  (pAmt*time*rate)/100.0f;
	}//method
}//class
