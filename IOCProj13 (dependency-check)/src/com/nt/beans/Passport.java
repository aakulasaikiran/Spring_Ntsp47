package com.nt.beans;

public class Passport {
	private String pno;
	private String country;
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Passport [pno=" + pno + ", country=" + country + "]";
	}
	

}
