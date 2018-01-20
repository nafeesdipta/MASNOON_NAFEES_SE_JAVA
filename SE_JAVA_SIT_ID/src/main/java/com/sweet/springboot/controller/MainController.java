package com.sweet.springboot.controller;


import org.springframework.stereotype.*;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String hello(){
		return "index";
	}
}
