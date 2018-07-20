package com.nt.beans;

public class FirstFlight implements Courier {

	@Override
	public final void deliver(int orderId) {
		  System.out.println(orderId+" order items are ready to deliver throguh Firstflight");

	}

}
