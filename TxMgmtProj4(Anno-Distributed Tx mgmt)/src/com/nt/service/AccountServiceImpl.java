package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.DepositeDAO;
import com.nt.dao.WithdrawDAO;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	@Autowired
	private  DepositeDAO depositeDAO;
	@Autowired
	private  WithdrawDAO withdrawDAO;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean transferMoney(int srcNo,int destNo,int amt){
		int result1=0,result2=0;
		//use DAO
		result1=withdrawDAO.withdraw(srcNo, amt);
      result2=depositeDAO.deposite(destNo, amt);
      if(result1==0 || result2==0)
    	  throw new RuntimeException();
      else
    	  return true;
	}


		
}//service(-,-)
