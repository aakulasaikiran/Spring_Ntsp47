package com.nt.beans;

import java.util.Arrays;

public class MultiMedia {
	  private String [] colors;
	  public void setColors(String colors[]){
	        this.colors=colors;
	   }
	@Override
	public String toString() {
		return "MultiMedia [colors=" + Arrays.toString(colors) + "]";
	}
	  

}
