package com.zeeshan.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WIshController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Calendar cl = Calendar.getInstance();
		int hour = cl.get(Calendar.HOUR_OF_DAY);
		String msg = null;
		if (hour <= 12) {
			msg = "GOOD MORNING";
		} else {
			msg = "GOOD EVENING";
		}
		System.out.println(msg);
		return new ModelAndView("result", "wmsg", msg);
	}

}
