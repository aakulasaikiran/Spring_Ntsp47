package com.nt.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.BankDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {
   @Autowired
	private BankDAO  dao;



	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="java.sql.SQLException")
	public boolean transferMoney(int srcNo, int destNo, int amount) throws SQLException{
		int result1=0;
		int result2=0;
	
		//use DAO
		result1=dao.withdraw(srcNo, amount);
		result2=dao.deposite(destNo, amount);
		if(result1==0 || result2==0)
			  throw new SQLException();
		else
		return true;	
	}

}
