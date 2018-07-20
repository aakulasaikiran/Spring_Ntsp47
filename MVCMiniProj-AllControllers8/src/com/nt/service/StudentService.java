package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDTO;

public interface StudentService {
	public List<StudentDTO>  listStudents();
	public StudentDTO  searchStudentDetialsByNo(int no);
	public  String  modifyStudentDetails(StudentDTO dto); 
	public String registerStudent(StudentDTO dto);
	public String fireStudent(int no);

}
