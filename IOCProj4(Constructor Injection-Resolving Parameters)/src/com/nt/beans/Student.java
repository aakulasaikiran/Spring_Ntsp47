package com.nt.beans;

import java.beans.ConstructorProperties;

public class Student{
  private int  sno;
  private String sname;
  private float avg;
  @ConstructorProperties({"no","name","aggr"})
public Student(int no,String  name,float aggr){
      this.sno=no;
      this.sname=name; 
      this.avg=aggr;
   }
 // toString()
@Override
public String toString() {
	return "Student [sno=" + sno + ", sname=" + sname + ", avg=" + avg + "]";
}

}