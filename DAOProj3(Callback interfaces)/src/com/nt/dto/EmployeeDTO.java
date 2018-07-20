package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private int eno;
	private String ename;
	private String desg;
	private int salary;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [eno=" + eno + ", ename=" + ename + ", desg=" + desg + ", salary=" + salary + "]";
	}

}
