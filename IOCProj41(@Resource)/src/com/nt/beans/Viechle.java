package com.nt.beans;

import javax.annotation.Resource;

public class Viechle {

	
	private Engine engg;
	




	@Resource(name="engg1")
	public void setEngg(Engine engg) {
		this.engg = engg;
	}

	/*@Resource(name="engg1")
	public void assign(Engine engg){
		this.engg=engg;
	}*/


	/*public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}*/
	
	

	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}
	
	
	

}
