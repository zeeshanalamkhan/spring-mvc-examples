package com.zeeshan.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.zeeshan.command.StudentCommand;
import com.zeeshan.dao.StudentRegistrationDAO;

import lombok.Data;

@SuppressWarnings("deprecation")
@Data
public class DateBinderController extends SimpleFormController {

	private StudentRegistrationDAO dao;

	@Override
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		StudentCommand cmd = (StudentCommand) command;
		int count = dao.registerStudent(cmd);
		String msg = null;
		if (count != 0) {
			msg = "Registration Successful";
		} else {
			msg = "Registration failed";
		}
		return new ModelAndView("student_result", "cmdData", msg);

	}
}
