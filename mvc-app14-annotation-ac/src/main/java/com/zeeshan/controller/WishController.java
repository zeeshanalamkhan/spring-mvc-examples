package com.zeeshan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeeshan.service.WishService;

@Controller
public class WishController {

	@Autowired
	private WishService service;

	/*
	 * @RequestMapping("/wish.htm") public ModelAndView getWish() {
	 * 
	 * String msg = service.generateWishMessage(); return new ModelAndView("wish",
	 * "wmsg", msg); }
	 */

	@RequestMapping("/wish.htm")
	public String getWish(Model model) {

		String msg = service.generateWishMessage();
		model.addAttribute("wmsg", msg);
		return "wish";
	}

	/*
	 * @RequestMapping("/wish.htm") public String getWish(ModelMap map) {
	 * 
	 * String msg = service.generateWishMessage(); map.addAttribute("wmsg", msg);
	 * return "wish"; }
	 */

	/*
	 * @RequestMapping("/wish.htm") public String getWish(Map<String, Object> map) {
	 * 
	 * String msg = service.generateWishMessage(); map.put("wmsg", msg); return
	 * "wish"; }
	 */

	/*
	 * @RequestMapping("/wish.htm") public void getWish(Model model) {
	 * 
	 * String msg = service.generateWishMessage(); model.addAttribute("wmsg", msg);
	 * 
	 * }
	 */
}
