package com.nt.beans;

public class IntrAmtCalculator {
	
	public static float calcIntrAmt(float pAmt,float time ){
		System.out.println("IntrAmtCalculator: calcIntrAmt(-,-)");
		return (pAmt*time*2.0f/100.0f);
	      
	    }
	public float calcIntrAmt(float pAmt){
		System.out.println("IntrAmtCalculator: calcIntrAmt(-)");
		return (pAmt*6*2.0f/100.0f);
	      
	    }


}
