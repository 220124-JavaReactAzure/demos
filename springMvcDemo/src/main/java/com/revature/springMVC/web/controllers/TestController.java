package com.revature.springMVC.web.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.revature.springMVC.web.dto.LoginRequest;
import com.revature.springMVC.web.dto.LoginResponse;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(method = RequestMethod.GET, value = "/test1")
	public @ResponseBody String test1() {
		return "/springMVCDemo/test/test1 was a success! He did the thing! Yay :D";
	}
	
	@GetMapping("/test2")
	public @ResponseBody String test2() {
		return "/springMCVMVCDemo/test/test2 was a success! He did the thing! Yay :D";
	}
	
	@GetMapping("/test3")
	public @ResponseBody String test3(@RequestParam String someValue, @RequestParam(value="anotherValue", required = false) String whatitis) {
		return "springMVCDemo/test/test1 was a success! He did the thing! Yay :D " + someValue + " " + whatitis;
	}
	
	@GetMapping("/test4/{someValue}/{anotherValue}")
	public @ResponseBody String test4(@PathVariable String someValue, @PathVariable(value="anotherValue", required = false) String whatitis) {
		return "springMVCDemo/test/test1 was a success! He did the thing! Yay :D " + someValue + " " + whatitis;
	}
	
	@GetMapping("/test5")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void test5() {
		System.out.println("This was returned to the server");
	}	
	
	@GetMapping("/test6")
	public ResponseEntity<String> test6(@RequestParam boolean brewCoffee){
		if(brewCoffee) {
			return new ResponseEntity<>("coffee brewed", HttpStatus.OK);
		}
		
		return new ResponseEntity<>("did not brew coffee", HttpStatus.I_AM_A_TEAPOT);
	}
	
	@GetMapping("/test7")
	public @ResponseBody String test7(HttpServletResponse resp) {
		resp.setStatus(206);
		resp.addHeader("custom-header", "oh-look-a-header");
		return "look test7 is functionalllll!!!!";
	}
	
	@GetMapping("/test8")
	public @ResponseBody String test8(@RequestHeader(required = false) String someHeader) {
		return "He test 8 has a header of " + someHeader;
	}
	
	@PostMapping(value="/test9", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody LoginResponse test9(@RequestBody LoginRequest loginRequest) {
		System.out.println(loginRequest);
		return new LoginResponse(loginRequest.getUsername(), "JWT: ASDFASFASDFS-STS-IS-PERFECT-asdfasd");
	}
	
}
