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
public class StudentUpdateController extends SimpleFormController {

	private StudentService service;

	
	
	@Override
	protected Object formBackingObject(HttpServletRequest request) throws Exception {

		int no = Integer.parseInt(request.getParameter("id"));
		StudentDTO dto = service.getStudentById(no);
		StudentCommand cmd = new StudentCommand(dto.getSno(), dto.getSname(), dto.getSadd());
		return cmd;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

		StudentCommand cmd = (StudentCommand) command;
		StudentDTO dto = new StudentDTO(cmd.getSno(), cmd.getSname(), cmd.getSadd());
		String updMsg = service.updateStudent(dto);
		return new ModelAndView(getSuccessView(), "updMsg", updMsg);
	}
}
