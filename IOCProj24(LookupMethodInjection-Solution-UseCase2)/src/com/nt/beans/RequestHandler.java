package com.nt.beans;
public class RequestHandler{
   public static  int count;
  
    public RequestHandler() {
		System.out.println("RequestHandler:0-paaram constructor");
	}
   
   public void handle(String data){
     count++;
      System.out.println("Handling request no"+count+"with data"+data);
     }
 }
