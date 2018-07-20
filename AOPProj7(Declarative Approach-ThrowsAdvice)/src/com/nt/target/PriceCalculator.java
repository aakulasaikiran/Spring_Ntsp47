package com.nt.target;

public class PriceCalculator {
	
	public int calcPrice(int price,int qty){
		if(price<=0 || qty<=0)
			throw new IllegalArgumentException("Invalid price,rate values");
		else
			return price*qty;
	}

}
