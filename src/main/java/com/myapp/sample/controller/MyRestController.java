package com.myapp.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping("/greeting")
	public String greeting() {
		return "Hello its me";
	}

}
