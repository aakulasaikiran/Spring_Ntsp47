package com.nt.beans;

public class DTDC implements Courier{
	
	public DTDC() {
		  System.out.println("DTDC: 0-param constructor");
		}
		

	@Override
	public final void deliver(int orderId) {
		System.out.println(orderId+"  order items ready to deliver through DTDC ");
	}

}
