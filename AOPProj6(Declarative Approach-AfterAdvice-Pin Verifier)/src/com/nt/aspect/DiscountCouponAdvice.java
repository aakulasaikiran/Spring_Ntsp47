package com.nt.aspect;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DiscountCouponAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
		String  couponMsg=null;
		FileWriter writer=null;
		// generate coupon Msg
		retVal=(Float)retVal+1000;
		if((Float)retVal>=30000)
			couponMsg="Avail 25% discount on next purchase";
		else if((Float)retVal>=20000)
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
