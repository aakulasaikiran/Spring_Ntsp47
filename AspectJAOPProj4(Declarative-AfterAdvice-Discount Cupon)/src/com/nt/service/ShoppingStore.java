package com.nt.service;

public class ShoppingStore {
	
	public float purchase(String [] items,float price){
		int count=0;
		float billAmt;
		//get items count
		count=items.length;
		//calc bill Amt
		billAmt=price*count;
		
		return billAmt;
	}//purchase(-,-)
}//class
