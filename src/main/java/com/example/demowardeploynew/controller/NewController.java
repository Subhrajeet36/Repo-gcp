package com.example.demowardeploynew.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	
	@GetMapping("/")
	public String getValue() {
		return "This is value";
	}

}
