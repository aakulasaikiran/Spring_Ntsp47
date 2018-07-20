package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String  GET_ALL_STUDENTS_QRY="SELECT SNO,SNAME,SADD FROM STUDENT";
	private static final String  GET_STUDENT_DETAILS_BY_NO="SELECT SNO,SNAME,SADD FROM STUDENT WHERE SNO=?";
	private static final String  UPDATE_STUDENT_DETAILS_BY_NO="UPDATE STUDENT SET SNAME=?,SADD=? WHERE SNO=?"; 
	private static final String  INSERT_STUDENT="INSERT INTO STUDENT VALUES(?,?,?)"; 
	private static final String  DELETE_STUDENT="DELETE FROM STUDENT WHERE SNO=?"; 
	
	
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public List<StudentBO> getAllStudents(){
		List<StudentBO> listBO=null;
		listBO=jt.query(GET_ALL_STUDENTS_QRY, new StudentMapper());
		return listBO;
	}
	
	private class StudentMapper implements RowMapper<StudentBO>{
		@Override
		public StudentBO mapRow(ResultSet rs, int pos) throws SQLException {
				StudentBO bo=null;
				//Convert ResultSet record into BO obj
				bo=new StudentBO();
				bo.setSno(rs.getInt(1));
				bo.setSname(rs.getString(2));
				bo.setSadd(rs.getString(3));
				
				return bo;
		}//mapRow(-,-)
	}//StudentMapper
	
	@Override
	public StudentBO getStudentDetailsBySno(int no) {
		StudentBO bo=null;
		bo=jt.queryForObject(GET_STUDENT_DETAILS_BY_NO, new StudentMapper(),no);
		return bo;
	}
	
	@Override
	public int updateStudent(StudentBO bo) {
		int cnt=0;
		cnt=jt.update(UPDATE_STUDENT_DETAILS_BY_NO, bo.getSname(),bo.getSadd(),bo.getSno());
		return cnt;
	}
	
	@Override
	public int insertStudent(StudentBO bo) {
		int cnt=0;
		cnt=jt.update(INSERT_STUDENT, bo.getSno(),bo.getSname(),bo.getSadd());
		return cnt;
	}
	
	@Override
	public int deleteStudent(int no) {
		int cnt=0;
		cnt=jt.update(DELETE_STUDENT,no);
		return cnt;
	}
}//class

