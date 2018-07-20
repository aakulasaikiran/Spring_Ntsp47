package com.nt.service;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankService {
	private BankDAO  dao;

	public void setDao(BankDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean transferMoney(int srcNo, int destNo, int amount) {
		int result1=0;
		int result2=0;
		//use DAO
		result1=dao.withdraw(srcNo, amount);
		result2=dao.deposite(destNo, amount);
		if(result1==0 || result2==0)
			  throw new RuntimeException();
		else
		return true;	
	}

}
