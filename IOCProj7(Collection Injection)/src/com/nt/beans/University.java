package com.nt.beans;

import java.util.Map;

public class University{
  private Map<?,?> facultySubjects;
  public void setfacultySubjects(Map <?,?> facultySubjects)
  {
      this.facultySubjects=facultySubjects;
    }
  //toString
  @Override
  public String toString() {
	  System.out.println(facultySubjects.getClass());
	 return "University [facultySubjects=" + facultySubjects + "]";
   } 
 }

