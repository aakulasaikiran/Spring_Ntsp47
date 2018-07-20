package com.nt.aspect;

import java.io.FileWriter;
import java.io.IOException;

import org.aspectj.lang.JoinPoint;

public class DiscountCouponAspect{


	public void couponGenerator(JoinPoint jp,float bAmt) throws Throwable {
		String  couponMsg=null;
		FileWriter writer=null;

		// generate coupon Msg
		if((Float)bAmt>=30000)
			couponMsg="Avail 25% discount on next purchase";
		else if((Float)bAmt>=20000)
			couponMsg="Avail 20% discount on next purchase";
		else 
			couponMsg="Avail 10% discount on next purchase";
		//write couponMsg to File
		try{
		writer=new FileWriter("E:/spring/coupon.txt");
		 writer.write(couponMsg);
		 writer.flush();
		 writer.close();
		}//try
		catch(IOException ioe){
		 ioe.printStackTrace();
		}
  }//method
}//class
