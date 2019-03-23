package com.zeeshan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.zeeshan.command.EmpCommand;
import com.zeeshan.dto.EmpDTO;
import com.zeeshan.service.EmpService;

import lombok.Data;

@SuppressWarnings("deprecation")
@Data
public class EmpInsertController extends AbstractWizardFormController {

	private EmpService service;

	@Override
	protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		EmpCommand cmd = (EmpCommand) command;
		EmpDTO dto = new EmpDTO(cmd.getEmpNo(), cmd.getEname(), cmd.getJob(), cmd.getSalary());
		String res = service.registerEmp(dto);

		return new ModelAndView("result", "result", res);
	}

	@Override
	public ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

		return new ModelAndView("home");
	}
	
	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return new ModelAndView("dblpost");
	}
}
