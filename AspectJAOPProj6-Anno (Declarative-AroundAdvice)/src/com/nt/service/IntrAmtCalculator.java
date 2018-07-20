package com.nt.service;

import org.springframework.stereotype.Service;

@Service("iac")
public class IntrAmtCalculator implements IntrAmtCalculatorInterface {
	
	public  float calcSimpleIntrAmt(float pAmt,float time,float rate ){
		System.out.println("IntrAmtCalculator:calcSimpleIntrAmt(-,-,-)");
		return  (pAmt*time*rate)/100.0f;
	}//method
	
	public float calcCompoundIntrAmt(float pAmt,float time,float rate){
		System.out.println("IntrAmtCalculator:calcCompoundIntrAmt(-,-,-)");
		return  ( pAmt*(float)Math.pow((1+rate/100),time))-pAmt;
		
	}

}
