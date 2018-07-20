package com.nt.beans;

import java.util.Date;

public class Dept {
	private int deptno;
	private String deptName;
	private  Date  dop;
	
	public Dept() {
	  System.out.println("Dept:0-param constructor");
	}
	
	
	public Dept(int deptno, String deptName, Date dop) {
	   System.out.println("Dept:3-param constructor");
		this.deptno = deptno;
		this.deptName = deptName;
		this.dop = dop;
	}


	//toString
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", deptName=" + deptName + ", dop=" + dop + "]";
	}
	

}
