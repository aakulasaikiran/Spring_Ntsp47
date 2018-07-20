package com.nt.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

import com.nt.bo.StudentBO;
import com.nt.dto.StudentDTO;

public class StudentDAOImpl implements StudentDAO {
	private static final String UPDATE_STUDENT_DETAILS_BY_NO="UPDATE STUDENT SET SNAME=?,SADD=? WHERE SNO=?";
	private StudentUpdator updator;
	
	private StudentDAOImpl(DataSource ds){
		updator=new StudentUpdator(ds);
	}//constructor

	@Override
	public int updateStudentDetails(StudentBO bo) {
		int cnt=0;
		   cnt=updator.updateDetails(bo);
		return cnt;
	}//method
	
	private class StudentUpdator  extends SqlUpdate{
		public StudentUpdator(DataSource ds) {
			//set DataSource , Query to the super class
			super(ds,UPDATE_STUDENT_DETAILS_BY_NO);
			//declae params through super class
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.INTEGER));
			//compile query
			super.compile();
		}//constructor
		
		public int updateDetails(StudentBO bo){
			int cnt=0;
			//use super class update(-,-) to execute SQL update query
			cnt=super.update(bo.getSname(),bo.getSadd(),bo.getSno());
			return cnt;
		}//updateDetails(-)
	}//inner class

}//DAO class
