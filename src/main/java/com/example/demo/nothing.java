package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class nothing {

	@RequestMapping("/bu")
	public String bu() {
		return "Hello world";
	}
}
