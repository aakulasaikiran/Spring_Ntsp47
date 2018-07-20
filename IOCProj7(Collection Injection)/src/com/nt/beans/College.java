package com.nt.beans;

import java.util.List;

public class College {
 private List<String> names;
 public void setNames(List<String> names){
	   this.names=names;
	   }
 
@Override
public String toString() {
	System.out.println( names.getClass());
	return "College [names=" + names + "]";
}
  
	
}
