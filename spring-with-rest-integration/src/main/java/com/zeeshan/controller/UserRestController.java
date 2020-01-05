package com.zeeshan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zeeshan.domain.User;
import com.zeeshan.service.UserService;

@RestController
public class UserRestController {

	@Autowired(required = true)
	private UserService service;

	public void setService(UserService service) {
		System.out.println("UserRestController.setService()");
		this.service = service;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = { "application/xml", "application/json" })
	public @ResponseBody String addUser(@RequestBody User user) {

		boolean isAdded = service.add(user);
		if (isAdded) {
			return "User added successfully......";
		} else {
			return "Failed to Add the User";
		}
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET, produces = { "application/xml", "application/json" })

	public @ResponseBody String getUserById(@RequestParam(name = "uid") String uid) {
		System.out.println("Getting User with use id: " + uid);
		User user = service.get(uid);
		return uid;
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = { "application/xml", "application/json" })
	public @ResponseBody String update(@RequestParam("uid") String uid, @RequestBody User user) {

		boolean isUpdated = service.update(user, uid);
		if (isUpdated) {
			return "User updated Successfully...";
		} else {
			return "Failed to update the User.....";
		}
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, consumes = { "application/xml",
			"application/json" })
	public @ResponseBody String delete(@RequestParam("uid") String uid) {

		boolean isDeleted = service.delete(uid);
		if (isDeleted) {
			return "User deleted Successfully...";
		} else {
			return "User Failed to delete....";
		}

	}
}
