package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	private int id;
	private String type;
	private String name;
	@Required
	public void setId(int id) {
		this.id = id;
	}
	@Required
	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", type=" + type + ", name=" + name + "]";
	}
	

}
