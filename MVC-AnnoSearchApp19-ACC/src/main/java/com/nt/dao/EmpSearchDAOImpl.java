package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;

@Repository("searchDAO")
public class EmpSearchDAOImpl implements EmpSearchDAO {
	private static final String  SEARCH_EMP_DETAILS=" SELECT EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP WHERE "
                                                                                                       +" (EMPNO IS NOT NULL AND EMPNO=?) OR"
                                                                                                       + "(ENAME IS NOT NULL AND ENAME LIKE ?) OR"
                                                                                                       +"(JOB IS NOT NULL AND JOB LIKE ?) OR"
                                                                                                       +" (SAL IS NOT NULL AND SAL=?)";
                                                                                                       
   @Inject                                                                                                    
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<SearchResultBO> search(SearchBO bo) {
		 List<SearchResultBO> listRBO=null;
		 //execute the Query
		 listRBO=(List<SearchResultBO>)jt.query(SEARCH_EMP_DETAILS,
				                                                                          new EmpRowMapper() ,
				                                                                          bo.getNo(),bo.getName(),
				                                                                          bo.getJob(),bo.getSalary());
		return listRBO;
	}
	private class EmpRowMapper implements RowMapper<SearchResultBO>{
		@Override
		public SearchResultBO mapRow(ResultSet rs, int pos) throws SQLException {
			SearchResultBO rbo=null;
			//copy each Record of ResultSEt to BO class obj
			rbo=new SearchResultBO();
			rbo.setNo(rs.getInt(1));
			rbo.setName(rs.getString(2));
			rbo.setJob(rs.getString(3));
			rbo.setSalary(rs.getInt(4));
			rbo.setDeptNo(rs.getInt(5));
			rbo.setMgrNo(rs.getInt(6));
			return rbo;
			}//mapRow(-,-)
	}//inner class

}//outer class
