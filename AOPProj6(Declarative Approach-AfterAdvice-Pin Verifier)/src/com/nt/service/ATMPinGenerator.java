package com.nt.service;

import java.util.Random;

public class ATMPinGenerator {
	
	public int generatePin(){
		Random random=null;
		int pin=0;
		// get random value as the pin number.
		random=new Random();
		pin=random.nextInt(9999);
		return pin;
	}
	
}//class
