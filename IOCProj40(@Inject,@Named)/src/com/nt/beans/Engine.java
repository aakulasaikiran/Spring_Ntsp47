package com.nt.beans;



import java.util.Date;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
@Resource
@Named("engg2")
public class Engine {
	@Value("1001")
	private int id;
	
	@Value("diesel")
	private String type;


	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [id=" + id + ", type=" + type + "]";
	}
	
	
	

}
