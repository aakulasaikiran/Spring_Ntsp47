package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface StudentDAO {
	public  List<StudentBO>  getAllStudents(); 
	public StudentBO  getStudentDetailsBySno(int no);
	public  int  updateStudent(StudentBO bo);
	public  int  insertStudent(StudentBO bo);
	public int  deleteStudent(int no);

}
