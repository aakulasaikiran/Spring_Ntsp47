package com.nt.service;

public class IntrAmtCalculator {
	
	public float calcIntrAmt(float pAmt,float rate,float time){
		return pAmt*time*rate/100.0f;
	}

}
