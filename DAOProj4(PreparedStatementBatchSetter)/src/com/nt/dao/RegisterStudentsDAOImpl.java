package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class RegisterStudentsDAOImpl implements RegisterStudentsDAO{
	private static final String  REGISTER_STUDENT_QRY="INSERT  INTO STUDENT VALUES(?,?,?)";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int[] insert(List<StudentBO> listBO) {
		int result[]=null;
		result=jt.batchUpdate(REGISTER_STUDENT_QRY, new StudentPreparedStatementBatchSetter(listBO));
	    return result;
	}
	
	private static class StudentPreparedStatementBatchSetter implements BatchPreparedStatementSetter{
     private List<StudentBO> listBO=null;
		public StudentPreparedStatementBatchSetter(List<StudentBO> listBO){
			this.listBO=listBO;
		}
		@Override
		public int getBatchSize() {
			System.out.println("inner class:getBatchSize()");
			return listBO.size();
		}

		@Override
		public void setValues(PreparedStatement ps, int index) throws SQLException {
			System.out.println("inner class : setValues(-,-)");
			ps.setInt(1,listBO.get(index).getSno());
			ps.setString(2,listBO.get(index).getSname());
			ps.setString(3,listBO.get(index).getSadd());
		}
		
	}
}
