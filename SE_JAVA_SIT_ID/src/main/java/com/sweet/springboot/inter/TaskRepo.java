package com.sweet.springboot.inter;

import org.springframework.data.repository.CrudRepository;

import com.sweet.springboot.model.Task;

public interface TaskRepo extends CrudRepository<Task, Integer>{

}
