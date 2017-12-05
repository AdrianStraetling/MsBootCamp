package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping(path = "/hello", produces = "application/json")
	public String hello() {

		return "hello";
	}
}
