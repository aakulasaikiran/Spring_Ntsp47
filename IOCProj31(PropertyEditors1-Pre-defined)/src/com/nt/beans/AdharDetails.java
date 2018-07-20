package com.nt.beans;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class AdharDetails {
	private long id;
	private String name;
	private Date  dob;
	private float age;
	private File photo;
	private String[] verifiers;
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public void setVerifiers(String[] verifiers) {
		this.verifiers = verifiers;
	}
	@Override
	public String toString() {
		return "AdharDetails [id=" + id + ", name=" + name + ", dob=" + dob + ", age=" + age + ", photo=" + photo
				+ ", verifiers=" + Arrays.toString(verifiers) + "]";
	}
	
	
	

}
