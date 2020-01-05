package com.zeeshan.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
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
		EmpDTO dto = new EmpDTO(cmd.getEmpNo(), cmd.getEname(), cmd.getJob(), cmd.getMgr(), cmd.getHireDate(),
				cmd.getSalary(), cmd.getComm(), cmd.getDeptNo());
		String res = service.registerEmp(dto);

		return new ModelAndView("result", "result", res);
	}

	@Override
	public ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

		return new ModelAndView("home");
	}

	@Override
	public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));

	}

	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return new ModelAndView("dblpost");
	}
}
