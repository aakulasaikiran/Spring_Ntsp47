package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String GET_STUDENT_DETAILS_BY_ADDRS="SELECT SNO,SNAME,SADD FROM STUDENT WHERE SADD=?"; 
	private StudentSelector selector;
	public StudentDAOImpl(DataSource ds){
		selector=new StudentSelector(ds);
	}

	@Override
	public List<StudentBO> getStudentDetailsByAddrs(String addrs) {
		List<StudentBO> listBO=null;
		//call Sub class method
		listBO=selector.findDetailsByAddrs(addrs);
		return listBO;
	}//method

	//Sub class Supporting Mapping SQL Operations as sub classes
	private class StudentSelector extends MappingSqlQuery<StudentBO>{
		
		public StudentSelector(DataSource ds) {
			  //set DataSoruce, Query to super class
			super(ds,GET_STUDENT_DETAILS_BY_ADDRS);
			//declare the query params to super class
			super.declareParameter(new SqlParameter(Types.VARCHAR));
		    //make super class to compile the SQL query
			super.compile();
		}//constructor
		
		public  List<StudentBO> findDetailsByAddrs(String addrs){
			List<StudentBO> listBO=null;
			//Call super class execute(-) to execute the Query
			listBO=super.execute(addrs);
			return listBO;
		}//method

		@Override
		protected StudentBO mapRow(ResultSet rs, int index) throws SQLException {
			System.out.println("StudentSelector: mapRow(-,-)");
		       StudentBO bo=null;
		       // copy each record of ReultSet to STudentBO obj
		       bo=new StudentBO();
		       bo.setSno(rs.getInt(1));
		       bo.setSname(rs.getString(2));
		       bo.setSadd(rs.getString(3));
			return bo;
		}//mapRow(-,-)
		
	}//innerClass
}//outerClass
