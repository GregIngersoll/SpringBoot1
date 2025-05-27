package com.gpingersoll.springboot.demo.myApplication.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

	// Expose / endpoint return "Hello World"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World 2!";
	}

	@GetMapping("/foobar")
	public String runFoobar() {
		return "Foobar";
	}

}
