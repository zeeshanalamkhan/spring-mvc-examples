/**
 * 
 */
package com.zeeshan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.zeeshan.command.StudentCommand;
import com.zeeshan.dto.StudentDTO;
import com.zeeshan.service.StudentService;

import lombok.Data;

/**
 * @author ZEESHAN KHAN
 *
 */
@SuppressWarnings("deprecation")
@Data
public class StudentInsertController extends SimpleFormController {

	private StudentService service;

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

		StudentCommand cmd = (StudentCommand) command;
		StudentDTO dto = new StudentDTO(cmd.getSno(), cmd.getSname(), cmd.getSadd());
		String result = service.insertStudent(dto);
		return new ModelAndView("insert_result", "insResult", result);
	}

	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		return new ModelAndView("dblpost");
	}
}
