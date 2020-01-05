/**
 * 
 */
package com.zeeshan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.zeeshan.command.RegisterCommand;

/**
 * @author ZEESHAN KHAN
 *
 */
@SuppressWarnings("deprecation")
public class RegisterController extends AbstractWizardFormController {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.web.servlet.mvc.AbstractWizardFormController#
	 * processFinish(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, java.lang.Object,
	 * org.springframework.validation.BindException)
	 */
	@Override
	public ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

		RegisterCommand cmd = (RegisterCommand) command;

		return new ModelAndView("result", "res", cmd);
	}

	@Override
	public ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

		return new ModelAndView("welcome");
	}

}
