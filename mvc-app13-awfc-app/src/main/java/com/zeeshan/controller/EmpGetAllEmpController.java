package com.zeeshan.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.zeeshan.dto.EmpDTO;
import com.zeeshan.service.EmpService;

import lombok.Data;

@SuppressWarnings("deprecation")
@Data

public class EmpGetAllEmpController extends SimpleFormController {

	private EmpService service;

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<EmpDTO> listDTO = service.getAllEmployees();

		return new ModelAndView("listEmps", "empList", listDTO);
	}

}
