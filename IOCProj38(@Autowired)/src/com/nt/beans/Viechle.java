package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Viechle {

	@Autowired
	//@Qualifier("e1")
	@Qualifier("e1")
	private Engine engg;
	
	/*@Autowired(required=true)
	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}*/

	@Autowired(required=true)
	
	public Viechle(Engine engg) {
		System.out.println("Viechle:0-param constructor");
	}
	
	/*@Autowired(required=true)
	public Viechle(Engine engg){
		System.out.println("Viechle:1-param constructor");
		this.engg=engg;
	}*/
	
	/*@Autowired(required=true)
	public Viechle(Engine engg,int x){
		System.out.println("Viechle:2-param constructor");
		this.engg=engg;
	}*/
	
	
	
	
	/*@Autowired(required=true)
	private void  assign(Engine engg){
	System.out.println("assing()");
		this.engg=engg;
	}*/
	/*@Autowired
	public void setEngg(Engine engg) {
		System.out.println("setEngg");
		this.engg = engg;
	}
*/


	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}


	
	
	

}
