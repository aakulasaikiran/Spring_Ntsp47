package com.nt.dao;

public interface BankDAO {
	public int withdraw(int srcNo,int amount);
	public int deposite(int destNo,int amount);
}
