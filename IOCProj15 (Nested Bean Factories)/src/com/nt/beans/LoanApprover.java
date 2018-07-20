package com.nt.beans;

public class LoanApprover {
	 private LoanDetails  details;
	  //setter method
	 public void setDetails(LoanDetails details) {
			this.details = details;
		}
	  public String approveLoan(){
	    if(details.getLoanType().equals("agriculture")){
	        return  "Loan sanctioned for "+details.getLoanId()+" amt :"+details.getAmt();
	     }
	    else{
	        return " Loan application rejectecd";
	     }
	  }

	
}
