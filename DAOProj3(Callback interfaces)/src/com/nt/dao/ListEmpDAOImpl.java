package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmployeeBO;

public class ListEmpDAOImpl implements ListEmpDAO {
	private static final String GET_EMP_DETAILS_BY_NO = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP941 WHERE EMPNO=?";
	private static final String GET_EMP_DETAILS_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP941 WHERE JOB=?";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public EmployeeBO getEmpDetailsByNo(int eno) {
		EmployeeBO bo = jt.queryForObject(GET_EMP_DETAILS_BY_NO, new EmpMapper(), eno);
		return bo;
	}

	@Override
	public List<EmployeeBO> getEmpDetailsByDesg(String desg) {
		List<EmployeeBO> listbo = jt.query(GET_EMP_DETAILS_BY_DESG, new EmpExtractor(), desg);
		return listbo;
	}

	// inner class
	private class EmpMapper implements RowMapper<EmployeeBO> {

		@Override
		public EmployeeBO mapRow(ResultSet rs, int position) throws SQLException {
			EmployeeBO bo = null;
			// Process ResultSet and store the record into BO class obj
			bo = new EmployeeBO();
			bo.setEno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setDesg(rs.getString(3));
			bo.setSalary(rs.getInt(4));
			return bo;
		}// mapRow(-,-)
	}// inner class

	public class EmpExtractor implements ResultSetExtractor<List<EmployeeBO>> {

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listbo = null;
			EmployeeBO bo = null;
			listbo = new ArrayList<EmployeeBO>();
			while (rs.next()) {
				bo = new EmployeeBO();
				// get each record from ResultSet and store into BO obj
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				// add BO obj ListCollection (Listbo)
				listbo.add(bo);
			} // while
			return listbo;
		}// extractData
	}// inner class
}// outerClass
