package com.zeeshan.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.zeeshan.command.EmpCommand;

public class EmpValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.isAssignableFrom(EmpCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {

		EmpCommand cmd = (EmpCommand) target;
		
		if (cmd.getEmpNo() <= 0) {
			errors.rejectValue("empNo", "empNo.invalid");
		}
		if (cmd.getEname().equals("") || cmd.getEname() == null) {
			errors.rejectValue("ename", "ename.invalid");
		}
		if (cmd.getJob().equals("") || cmd.getJob() == null) {
			errors.rejectValue("job", "job.invalid");
		}
		if (cmd.getSalary() <= 0) {
			errors.rejectValue("salary", "salary.invalid");
		}
	}

}
