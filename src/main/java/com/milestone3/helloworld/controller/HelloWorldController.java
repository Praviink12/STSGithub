package com.milestone3.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
		
	}

}
