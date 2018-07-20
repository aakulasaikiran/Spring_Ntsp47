package com.nt.beans;

import java.util.List;

public class EnggCourse{
  
private List<String> subjects;
    //setters
  public void setSubjects(List<String> subjects) {
	this.subjects = subjects;
  }
    //toString
@Override
public String toString() {
	return "EnggCourse [subjects=" + subjects + "]";
}
  
      
   }