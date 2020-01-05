/**
 * 
 */
package com.zeeshan.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.zeeshan.command.TestCommand;

/**
 * @author ZEESHAN KHAN
 *
 */
public class OperationsController extends MultiActionController {

	public ModelAndView insert(HttpServletRequest req, HttpServletResponse res, TestCommand cmd) {
		System.out.println(cmd.getSno());
		return new ModelAndView("user", "operation", "insert operation");
	}
	
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res, TestCommand cmd) {
		System.out.println(cmd.getSno());
		return new ModelAndView("user", "operation", "update operation");
	}
	
	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res, TestCommand cmd) {
		System.out.println(cmd.getSno());
		return new ModelAndView("user", "operation", "delete operation");
	}
	
	public ModelAndView invalid(HttpServletRequest req, HttpServletResponse res, TestCommand cmd) {
		System.out.println(cmd.getSno());
		return new ModelAndView("user", "operation", "invalid operation");
	}
}
