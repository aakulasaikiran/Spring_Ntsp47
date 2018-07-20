package com.nt.service;

public interface IntrAmtCalculatorInterface {
	public  float calcSimpleIntrAmt(float pAmt,float time,float rate);
	public  float calcCompoundIntrAmt(float pAmt,float time,float rate);

}
