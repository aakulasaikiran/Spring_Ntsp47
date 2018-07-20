package com.nt.beans;

import java.util.Set;

public class MobileNetworkProvider {
	 private  Set<Long> phones;
	   
	  public void setPhones(Set<Long> phones){
	       this.phones=phones;
	    }

	@Override
	public String toString() {
		System.out.println(phones.getClass());
		return "MobileNetworkProvider [phones=" + phones + "]";
	}
}
