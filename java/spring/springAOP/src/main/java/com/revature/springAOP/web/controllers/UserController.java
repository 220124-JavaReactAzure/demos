package com.revature.springAOP.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.springAOP.services.UserServices;
import com.revature.springAOP.web.dtos.SignUp;

@RestController
@RequestMapping("/user")
public class UserController {

	private final UserServices userServices;
	
	@Autowired
	public UserController(UserServices userServices) {
		this.userServices = userServices;
	}
	
	@PostMapping(value = "/signup", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public void signup(@RequestBody SignUp signUp) {
		userServices.registerNewUser(signUp);
	}
}
