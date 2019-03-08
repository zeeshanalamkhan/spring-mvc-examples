package com.zeeshan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.zeeshan.commnad.StudentCommand;
import com.zeeshan.dto.StudentDTO;
import com.zeeshan.service.StudentService;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("deprecation")
public class StudentInsertController extends SimpleFormController {

	private StudentService service;

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

		StudentCommand cmd = (StudentCommand) command;
		StudentDTO dto = new StudentDTO(cmd.getSno(), cmd.getSname(), cmd.getSadd());
		String msg = service.registerStudent(dto);

		return new ModelAndView(this.getSuccessView(), "resMsg", msg);
	}
}
