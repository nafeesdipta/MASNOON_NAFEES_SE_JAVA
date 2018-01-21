package com.sweet.springboot.service;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.sweet.springboot.inter.TaskRepo;
import com.sweet.springboot.model.Task;
@Service
@Transactional
public class TaskService {

	private final TaskRepo taskrepo;

	public TaskService(TaskRepo taskrepo) {
		//super();
		this.taskrepo = taskrepo;
	}
	public List<Task> findAll(){
		List<Task> tasks = new ArrayList<>();
		for(Task task : taskrepo.findAll()){
			tasks.add(task);
		}
			return tasks;
	}
}
