package com.zeeshan.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.zeeshan.dto.EmpDTO;
import com.zeeshan.service.EmpService;

import lombok.Data;

@Data
public class EmpController extends AbstractController {

	private EmpService service;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<EmpDTO> listDTO = service.listAllEmp();
		/* return new ModelAndView("listEmps", "allEmp", listDTO); */
		if (request.getParameter("report").equals("pdf")) {
			return new ModelAndView("pdfView", "allEmp", listDTO);
		} else
			return new ModelAndView("excelView", "allEmp", listDTO);
	}
}
