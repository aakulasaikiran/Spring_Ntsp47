package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY="INSERT INTO SPRING_STUDENT VALUES(?,?,?,?,?)";
	
	private DataSource ds;
	
	public StudentDAOImpl() {
	  System.out.println("StudentDAOImpl:0-param constructor");
	}
	
	public void setDs(DataSource ds) {
		System.out.println("StudentDAOImpl:setDs(-)");
		this.ds = ds;
	}

	
 
	@Override
	public int insert(StudentBO bo) {
	    Connection con=null;	 
	    PreparedStatement ps=null;
	    int result=0;
		//write persistence logic
		try{
		// get connection obj from jdbc con pool
			con=ds.getConnection();
		// create Prepared Statement obj
			ps=con.prepareStatement(STUDENT_INSERT_QUERY);
		//set param values to Query
			ps.setInt(1,bo.getSno());
			ps.setString(2,bo.getSname());
			ps.setInt(3,bo.getTotal());
			ps.setFloat(4,bo.getAvg());
			ps.setString(5,bo.getResult());
			//execute Query
			result=ps.executeUpdate();
		}//try
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(con!=null)
					con.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}//finally
		return result;
	}//method
}//class

