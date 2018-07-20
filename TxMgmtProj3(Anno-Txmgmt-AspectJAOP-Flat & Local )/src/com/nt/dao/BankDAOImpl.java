package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bankDAO")
public class BankDAOImpl implements BankDAO {
	private static final String WITHDRAW_QRY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE-? WHERE ACCNO=?";
	private static final String DEPOSITE_QRY="UPDATE TX_ACCOUNT SET BALANCE=BALANCE+? WHERE ACCNO=?";
	
	@Autowired
	private JdbcTemplate  jt;

	
	@Override
	public int withdraw(int srcNo, int amount) {
		int count=0;
		count=jt.update(WITHDRAW_QRY,amount,srcNo);
		return count;
	}

	@Override
	public int  deposite(int destNo, int amount) {
		int count=0;
		count=jt.update(DEPOSITE_QRY,amount,destNo);
		return count;
	}

}
