package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("viechle")
@Scope("prototype")
public class Viechle {
   @Autowired
	private Engine engg;
   
   public Viechle() {
	System.out.println("Viechle:0-param constructor");
}
	
	@Override
	public String toString() {
		return "Viechle [engg=" + engg + "]";
	}

}
