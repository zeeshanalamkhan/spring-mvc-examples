package com.zeeshan.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.zeeshan.dto.StudentDTO;
import com.zeeshan.service.StudentService;

import lombok.Data;

@Data
public class ListStudentController extends AbstractController {

	private StudentService service;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<StudentDTO> listDTO = service.listStudents();
		System.out.println("STUDENT DTO"+listDTO);
		return new ModelAndView("list_student", "stList", listDTO);
	}

}
