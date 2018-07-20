package com.nt.customPE;

import java.beans.PropertyEditorSupport;

import com.nt.beans.IntrAmtDetails;

public class CustomIntrAmtDetailsEditor extends PropertyEditorSupport {
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println(text);
		// get Priciple Amt, rate of intrest , time details
		float pAmt=Float.parseFloat(text.substring(0, text.indexOf(",")));
		System.out.println(pAmt);
		float rate=Float.parseFloat(text.substring(text.indexOf(",")+1,text.lastIndexOf(",")));
		System.out.println(rate);
		float time=Float.parseFloat(text.substring(text.lastIndexOf(",")+1,text.length()));
		System.out.println(time);
		
		//create IntrAmtDetails class obj
		IntrAmtDetails details=new IntrAmtDetails();
		details.setpAmt(pAmt); details.setRate(rate); details.setTime(time);
		// Assign obj to property
		setValue(details);
	}//method
}//class
