package com.nt.service;

import java.sql.SQLException;

public interface BankService {
	
	public boolean transferMoney(int srcNo,int destNo,int amount)throws SQLException;

}
