package com.nt.dao;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentInsertDAOImpl implements StudentInsertDAO {
	private static final String  STUDENT_INSERT_QRY="INSERT INTO STUDENT VALUES(?,?,?)";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(StudentBO bo) {
		int cnt=0;
		cnt=jt.update(STUDENT_INSERT_QRY, bo.getSno(),bo.getSname(),bo.getSadd());
		return cnt;
	}//insert(-)
}//class
