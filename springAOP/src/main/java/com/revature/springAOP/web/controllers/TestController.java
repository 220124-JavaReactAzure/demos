package com.revature.springAOP.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.springAOP.exceptions.AmTeapotException;

@Controller
@RequestMapping("/test")
public class TestController {

	@GetMapping("/tw")
	public @ResponseBody String test() {
		return "test works";
	}
	
	@GetMapping("/tex")
	public void testEx() {
		throw new AmTeapotException("Hi this test is a teapot");
	}
}
