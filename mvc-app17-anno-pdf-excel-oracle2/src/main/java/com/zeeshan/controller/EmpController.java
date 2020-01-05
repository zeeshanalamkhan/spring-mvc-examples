package com.zeeshan.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.zeeshan.dto.EmpDTO;
import com.zeeshan.service.EmpService;

import lombok.Data;

@Data
@Controller
public class EmpController extends AbstractController {

	@Autowired
	private EmpService service;

	@RequestMapping("/listAllEmps.htm")
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
