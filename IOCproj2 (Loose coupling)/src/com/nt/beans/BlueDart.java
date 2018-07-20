package com.nt.beans;

public class BlueDart implements Courier {
	
	public BlueDart() {
	  System.out.println("BlueDart: 0-param constructor");
	}

	@Override
	public final void deliver(int orderId) {
	  System.out.println(orderId+" order items are ready to deliver throguh BlueDart");
	}

}
