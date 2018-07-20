package com.nt.beans;

import java.util.Date;

public class Computer{
	 
	private int id;
	  private String name;
	  private Date dom;
	  private Date doe;
	  //cosntructor for constructor injection
	  public Computer(int id, String name, Date dom, Date doe) {
	System.out.println("Computer:4-param constructor");
			this.id = id;
			this.name = name;
			this.dom = dom;
			this.doe = doe;
		}
	  //toString
	@Override
	public String toString() {
		return "Computer [id=" + id + ", name=" + name + ", dom=" + dom + ", doe=" + doe + "]";
	}
	  
	  
}