package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("depositeDAO")
public class DepositeDAOImpl implements DepositeDAO{
	@Autowired
	@Qualifier("mysqlJT")
	private  JdbcTemplate jt;
    private static final String  DEPOSITE_QUERY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE+? WHERE ACCNO=?";
    
	public int deposite(int accno, int amt){
		int count=0;
		count=jt.update(DEPOSITE_QUERY, amt,accno);
		return count;
	}

}
