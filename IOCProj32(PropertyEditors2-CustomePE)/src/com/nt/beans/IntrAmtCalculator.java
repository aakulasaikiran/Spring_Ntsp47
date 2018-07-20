package com.nt.beans;

public class IntrAmtCalculator {
	 private IntrAmtDetails details;
	  //setters
	    
	   public void setDetails(IntrAmtDetails details) {
		this.details = details;
	}

	public float calcIntrAmt(){
	     return (details.getpAmt()*details.getRate()*details.getTime())/100.0f;
	    }

}
