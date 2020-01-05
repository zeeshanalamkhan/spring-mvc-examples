package com.zeeshan.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.zeeshan.command.SearchCommand;
import com.zeeshan.dto.SearchDTO;
import com.zeeshan.dto.SearchResultDTO;
import com.zeeshan.service.EmpSearchService;

import lombok.Data;

@Data
@SuppressWarnings("deprecation")
public class EmpSearchController extends AbstractCommandController {

	private Logger logger = Logger.getLogger(EmpSearchController.class.getName());
	private EmpSearchService service;

	@Override
	protected ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object cmd, BindException be)
			throws Exception {

		logger.info("handle(-) invoked");

		SearchCommand command = (SearchCommand) cmd;
		SearchDTO dto = new SearchDTO(command.getNo(), command.getName(), command.getDesg(), command.getSalary());
		List<SearchResultDTO> listDTO = service.process(dto);
		return new ModelAndView("listEmps", "seachResults", listDTO);
	}

}
