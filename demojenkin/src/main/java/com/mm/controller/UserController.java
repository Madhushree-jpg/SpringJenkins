package com.mm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	
	@GetMapping("/hi")
	public String sayHello() {
		return "Hello World!!";
	}
	
	
	

}
