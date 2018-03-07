package com.sweet.springboot.inter;


//import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.sweet.springboot.model.Ram;

public interface RamRepo extends CrudRepository<Ram, Integer>{
	
}
