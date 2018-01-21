package com.sweet.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sweet.springboot.service.TaskService;
import com.sweet.springboot.service.TaskService;
@RestController
public class FirstController {
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping("/hello")
	public String hi(){
		return "Hello World!!! from Rest Controller";
	}
	@GetMapping("/alltasks")
	public String allTasks(){
		return taskService.findAll().toString();
	}
}