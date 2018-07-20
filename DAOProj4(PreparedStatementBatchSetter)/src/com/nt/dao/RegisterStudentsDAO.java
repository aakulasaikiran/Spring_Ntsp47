package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface RegisterStudentsDAO {
	public int[] insert(List<StudentBO> listBO);

}
