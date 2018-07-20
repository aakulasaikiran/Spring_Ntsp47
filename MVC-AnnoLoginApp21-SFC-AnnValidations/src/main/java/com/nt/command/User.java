package com.nt.command;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message="username is mandatory")
	private String uname;
	@NotEmpty(message="password is mandatory")
	private String pwd;
	
	private String dmn;
	private Date dob;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getDmn() {
		return dmn;
	}
	public void setDmn(String dmn) {
		this.dmn = dmn;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + ", dmn=" + dmn + ", dob=" + dob + "]";
	}
	

}
