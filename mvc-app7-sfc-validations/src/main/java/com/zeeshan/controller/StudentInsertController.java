package com.zeeshan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.zeeshan.command.StudentCommand;
import com.zeeshan.dto.StudentDTO;
import com.zeeshan.service.StudentInsertService;

import lombok.Data;

@Data
@SuppressWarnings("deprecation")
public class StudentInsertController extends SimpleFormController {

	private StudentInsertService service;

	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		return new ModelAndView("dblpost");
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

		StudentCommand cmd = (StudentCommand) command;
		if (cmd.getSadd().equalsIgnoreCase("Delhi")) {
			errors.rejectValue("sadd", "sadd.city");
			return showForm(request, response, errors);
		}

		StudentDTO dto = new StudentDTO(cmd.getSno(), cmd.getSname(), cmd.getSadd());
		String result = service.insert(dto);
		return new ModelAndView(this.getSuccessView(), "resMsg", result);
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request) throws Exception {
		StudentCommand cmd = new StudentCommand(100, "ZEESHAN", "ALIGARH");
		return cmd;
	}
}
