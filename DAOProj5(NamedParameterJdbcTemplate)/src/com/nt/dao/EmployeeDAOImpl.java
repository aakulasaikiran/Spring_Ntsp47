package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_NAME_BY_NO="SELECT  ENAME  FROM EMP WHERE EMPNO=:no";
	private static final String GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=:no";
	private static final String  INSERT_EMP_QRY="INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(:eno,:ename,:job,:salary)";
	private NamedParameterJdbcTemplate njt;

	public void setNjt(NamedParameterJdbcTemplate njt) {
		this.njt = njt;
	}

	@Override
	public String findEmpNameByNo(int eno) {
		Map <String,Object>params=null;
		String name=null;
		//pepare param values
		params=new HashMap<String,Object>();
		params.put("no",eno);
		 //execute the Query
	      name=njt.queryForObject(GET_EMP_NAME_BY_NO, params, String.class);
		return name;
	}

	@Override
	public EmployeeBO findEmpDetailsByNo(int eno) {
	 MapSqlParameterSource params=null;
	 EmployeeBO bo=null;
	 //prepare param values
	 params=new MapSqlParameterSource();
	 params.addValue("no",eno);
	 //execute the Query
	 bo=njt.queryForObject(GET_EMP_DETAILS_BY_NO, params, 
			                                       new EmpRowMapper());
		return bo;
	}

	@Override
	public int insert(EmployeeBO bo) {
		int cnt=0;
		BeanPropertySqlParameterSource  params=null;
		//prepare param values
		params=new BeanPropertySqlParameterSource(bo);
		//execute the Query
		cnt=njt.update(INSERT_EMP_QRY,params);
		return cnt;
	}
	
	private class EmpRowMapper implements RowMapper<EmployeeBO>{
		
		@Override
		public EmployeeBO mapRow(ResultSet rs, int pos) throws SQLException {
			EmployeeBO bo=null;
			//Store the record of ResultSet obj to BO obj
			bo=new EmployeeBO();
			bo.setEno(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSalary(rs.getInt(4));
			return bo;
		}//mapRow(-,-)
	}//inner class

}//DAOImpl class
