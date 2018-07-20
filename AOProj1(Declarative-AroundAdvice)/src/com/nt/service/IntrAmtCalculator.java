package com.nt.service;

public  class IntrAmtCalculator {

	public  float calcIntrAmt(float pAmt,float time,float rate ){
		System.out.println("IntrAmtCalculator:calcIntrAmt(-,-,-)");
		return  (pAmt*time*rate)/100.0f;
	}//method
}//class
