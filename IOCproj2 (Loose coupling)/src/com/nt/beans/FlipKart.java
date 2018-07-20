package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {
	private Courier courier;
	
	public FlipKart() {
	  System.out.println("FlipKart: 0-param constructor");
	}
	
	public FlipKart(Courier courier){
		System.out.println("FlipKart:1 -param constructor");
		this.courier=courier;
	}
	
	public void setCourier(Courier courier){
		System.out.println("FlipKart: setCourier(-)");
		this.courier=courier;
	}
	
	public void purchase(String[] items){
		int orderId=0;
		Random random;
		 //purchase the items
		random=new Random();
		orderId=random.nextInt(1000);
		System.out.println(Arrays.toString(items)+ "are purchased with orderId"+orderId);
		//deliver the items
		 courier.deliver(orderId);
	}

}
