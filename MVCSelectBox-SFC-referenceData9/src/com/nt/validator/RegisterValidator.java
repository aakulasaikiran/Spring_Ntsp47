package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.RegisterCmd;

public class RegisterValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.isAssignableFrom(RegisterCmd.class); 
	}
	@Override
	public void validate(Object cmd, Errors errors) {
		RegisterCmd command=null;
		//type casting
		command=(RegisterCmd)cmd;
		//form validations
		if(command.getSno()<=0){
			errors.rejectValue("sno","sno.invalid");
		}
	}//validate(-,-)

}
