package com.nt.beans;

public class Employee {
	private int id;

	private String name;
	private Passport passport;
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Passport getPassport() {
		return passport;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", passport=" + passport + "]";
	}
	
	
}
