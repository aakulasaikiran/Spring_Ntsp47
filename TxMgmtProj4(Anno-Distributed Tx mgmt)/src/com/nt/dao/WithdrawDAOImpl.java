package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("withdrawDAO")
public class WithdrawDAOImpl implements WithdrawDAO{
	@Autowired
	@Qualifier(value="oraJT")
	private  JdbcTemplate jt;
    private static final String  WITHDRAW_QUERY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?";
    
	public int withdraw(int accno, int amt){
		int count=0;
		count=jt.update(WITHDRAW_QUERY, amt,accno);
		return count;
	}

}
