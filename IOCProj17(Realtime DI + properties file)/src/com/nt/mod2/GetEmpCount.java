package com.nt.mod2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class GetEmpCount {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		int count=0;
		InputStream is=null;
		try{
		  //locate properties file
			is=new FileInputStream("src/com/nt/commons/jdbc.properties");
			//load properties file content to java.util.Properties class obj
			Properties props=new Properties();
			props.load(is);
			//writer jdbc code
			
			Class.forName(props.getProperty("jdbc.driver"));
			con=DriverManager.getConnection(props.getProperty("jdbc.url"),
					                                                             props.getProperty("db.user"),
					                                                             props.getProperty("db.pwd"));
			st=con.createStatement();
			rs=st.executeQuery("select count(*) from emp");
			count=0;
			if(rs.next())
				count=rs.getInt(1);
			System.out.println("Emp table records count"+count);
		}//try
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(rs!=null)
					rs.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			try{
				if(st!=null){
					st.close();
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			try{
				if(con!=null){
					con.close();
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}//finally			
	}//main
}//class
