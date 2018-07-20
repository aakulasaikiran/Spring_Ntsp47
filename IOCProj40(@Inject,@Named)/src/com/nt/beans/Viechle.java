package com.nt.beans;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;
@Resource
@Named("viechle")
public class Viechle {

	@Inject
	@Resource
	private Engine engg;
	
	
	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	
	@Inject
	
	public Viechle(Engine engg){
		System.out.println("Viechle:1-param constructor");
		this.engg=engg;
	}
	
	
	
	
	
	@Inject
	  @Resource
	private void  assign(Engine engg){
	System.out.println("assing()");
		this.engg=engg;
	}
	
	/*@Inject
	@Named("engg2")
	  @Resource
	public void setEngg(Engine engg) {
		System.out.println("setEngg");
		this.engg = engg;
	}*/



	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}
	
	
	

}
