package com.nt.beans;

public class TravelAgent {
	private TourPlan pa; 
	 public TravelAgent(){
	  System.out.println("TravelAgent:0-param constructor");
	}
	public TravelAgent(TourPlan pa) {
		System.out.println("TravelAgent:1-param constructor");
		this.pa = pa;
	}
	 public void setPlan(TourPlan pa) {
		 System.out.println("TravelAgent:setPlan(-)");
			this.pa = pa;
		}
	//toString
	@Override
	public String toString() {
		return "TravelAgent [pa=" + pa + "]";
	}
	 

}
