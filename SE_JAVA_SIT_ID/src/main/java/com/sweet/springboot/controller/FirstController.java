package com.sweet.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FirstController {
	
	@RequestMapping("/hello")
	public String hi(){
		return "Hello World!!! from Rest Controller";
	}
}