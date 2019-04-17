package com.zeeshan.multiple.ds.api.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zeeshan.multiple.ds.api.user.service.UserService;
import com.zeeshan.multiple.ds.api.model.user.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<User> findUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<User> allUsers() {
		return userService.findAllUsers();
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
}
