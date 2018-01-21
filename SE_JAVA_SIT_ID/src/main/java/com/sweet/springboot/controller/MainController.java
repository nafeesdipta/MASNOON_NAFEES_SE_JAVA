package com.sweet.springboot.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import org.springframework.web.bind.annotation.GetMapping;

import com.sweet.springboot.service.TaskService;

@Controller
public class MainController {
	
	@Autowired
	private TaskService taskService;
	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("tasks", taskService.findAll() );
		return "index";
	}
}
