package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCmd;

public class StudentCmdValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		//return clazz==StudentCmd.class;
		return clazz.isAssignableFrom(StudentCmd.class);
	}

	@Override
	public void validate(Object cmd, Errors errs) {
		StudentCmd command=null;
	  //type casting
		command=(StudentCmd)cmd;
		//form validaton logic (server side)
		if(command.getSno()<=0 ){
			errs.rejectValue("sno","sno.required");
		}
		if(command.getSname()==null || command.getSname().equals("")){
			errs.rejectValue("sname","sname.required");
		}
		if(command.getSadd()==null || command.getSadd().equals("")){
			errs.rejectValue("sadd","sadd.required");
		}
		
	}//validate(-,-)
}//class
