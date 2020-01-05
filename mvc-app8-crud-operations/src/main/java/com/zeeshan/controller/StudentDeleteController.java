/**
 * 
 */
package com.zeeshan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;
import org.springframework.web.servlet.mvc.AbstractController;

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
public class StudentDeleteController extends AbstractController {

	private StudentService service;

/*	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		int no = (Integer.parseInt(request.getParameter("id")));
		StudentCommand cmd = (StudentCommand) command;
		StudentDTO dto = new StudentDTO(cmd.getSno(), cmd.getSname(), cmd.getSadd());
		String msg = service.deleteStudentById(no);
		return new ModelAndView("delete_result", "delMsg", msg);
	}
*/
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		int no = (Integer.parseInt(request.getParameter("id")));
		String msg = service.deleteStudentById(no);
		return new ModelAndView("delete_result", "delMsg", msg);
	}

}
