package com.nt.bo;

public class StudentBO extends BaseBO {
	private String course;
 
	public StudentBO() {
		System.out.println("StudentBO:0-param consturctor");
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
