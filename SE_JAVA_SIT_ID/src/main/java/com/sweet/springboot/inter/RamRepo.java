package com.sweet.springboot.inter;

import org.springframework.data.repository.CrudRepository;

import com.sweet.springboot.model.Ram;

public interface RamRepo extends CrudRepository<Ram, Integer>{
	
}
