package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/welcome")
	public String welcomeMessage() {
		String msg = "Welcome to Ashok IT";
		return msg ;		
	}
	@GetMapping("/greet")
	public String greetMessage() {
		String msg = "Have a nice day!";
		return msg ;		
	}
}
