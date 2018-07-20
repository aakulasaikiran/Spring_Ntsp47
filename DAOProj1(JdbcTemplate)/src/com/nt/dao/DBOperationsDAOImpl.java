package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class DBOperationsDAOImpl implements DBOperationsDAO {
	private static final  String EMP_INSERT_QUERY="INSERT INTO EMP440(EMPNO,ENAME,JOB,SAL) VALUES(?,?,?,?)";
	private static final  String GET_EMP_SAL_BY_NO="SELECT SAL FROM EMP440 WHERE EMPNO=?";
	private static final  String UPDATE_EMP_SALARY_BY_NO="UPDATE EMP440 SET SAL=? WHERE EMPNO=?";
	private static final  String DELETE_EMP_BY_NO="DELETE EMP440 WHERE EMPNO=?";
	private static final  String GET_EMP_DETAILS_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP440 WHERE EMPNO=?";
	private static final  String GET_ALL_EMP_DETAILS="SELECT EMPNO,ENAME,JOB,SAL FROM EMP440";
	
	private JdbcTemplate jt;
	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int insert(int empno, String ename, String desg, int salary) {
		int cnt=jt.update(EMP_INSERT_QUERY, empno,ename,desg,salary);
		return cnt;
	}

	@Override
	public int getSalary(int empno) {
	   int salary=jt.queryForObject(GET_EMP_SAL_BY_NO, Integer.class,empno);
	   return salary;
	}

	@Override
	public int updateSalary(int empno, float newSal) {
		int result=jt.update(UPDATE_EMP_SALARY_BY_NO, newSal,empno);
		return result;
	}

	@Override
	public int deleteEmp(int empno) {
		int result=jt.update(DELETE_EMP_BY_NO,empno);
		return result;
	}

	@Override
	public Map<String, Object> listEmpDetails(int empno) {
		Map<String,Object> map=jt.queryForMap(GET_EMP_DETAILS_BY_NO,empno);
		return map;
	}

	@Override
	public List<Map<String, Object>> listAllEmpDetails() {
		List<Map<String,Object>> list=jt.queryForList(GET_ALL_EMP_DETAILS,new Object[]{});
		return list;
	}

}
