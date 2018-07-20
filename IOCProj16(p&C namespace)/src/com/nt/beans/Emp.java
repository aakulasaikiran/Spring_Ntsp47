package com.nt.beans;

public class Emp {
	private int eno;
	private String ename;
	private  Dept dept;
	
	public Emp() {
		System.out.println("Emp:0-param constructor");
	}
	
	public void setEno(int eno) {
		System.out.println("Emp:setEno(-)");
		this.eno = eno;
	}
	public void setEname(String ename) {
		System.out.println("Emp:setEname(-)");
		this.ename = ename;
	}
	public void setDept(Dept dept) {
		System.out.println("Emp:setDept(-)");
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + ", dept=" + dept + "]";
	}
	

}
