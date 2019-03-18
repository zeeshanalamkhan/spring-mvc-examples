package com.zeeshan.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.zeeshan.command.RegistrationCommand;

@SuppressWarnings("deprecation")
public class StudentRegistrationController extends SimpleFormController {

	@Override
	public Map<String, List<String>> referenceData(HttpServletRequest request) throws Exception {

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> courses = new ArrayList<String>();
		courses.add("Spring-CORE");
		courses.add("Spring-BOOT");
		courses.add("Spring-MVC");
		courses.add("Spring-AOP");
		courses.add("Spring-JDBC");
		map.put("courseList", courses);
		return map;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request) throws Exception {

//		int no = Integer.parseInt(request.getParameter("id"));
		RegistrationCommand cmd = new RegistrationCommand(1, "ZEESHAN", "Spring-CORE");
		return cmd;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

		return new ModelAndView("register_result");
	}
}
