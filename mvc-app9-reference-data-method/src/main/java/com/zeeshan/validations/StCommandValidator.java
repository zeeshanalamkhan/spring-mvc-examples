package com.zeeshan.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.zeeshan.command.RegistrationCommand;

public class StCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.isAssignableFrom(RegistrationCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {

		RegistrationCommand cmd = (RegistrationCommand) target;
		if (cmd.getSno() <= 0) {
			errors.rejectValue("sno", "sno.invalid");
		}
		if (cmd.getSname() == null || cmd.getSname().equals("")) {
			errors.rejectValue("sname", "sname.required");
		}
		if (cmd.getCourse() == null || cmd.getCourse().equals("")) {
			errors.rejectValue("course", "course.required");
		}
	}

}
