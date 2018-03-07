package com.sweet.springboot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sweet.springboot.inter.RamRepo;
import com.sweet.springboot.model.Ram;
@Service
@Transactional
public class RamService {
	
	private final RamRepo ramrepo;

	public RamService(RamRepo ramrepo) {
		//super();
		this.ramrepo = ramrepo;
	}
	
	public List<Ram> findAll(){
		List<Ram> task2 = new ArrayList<>();
		for(Ram t : ramrepo.findAll()){
			task2.add(t);
		}
			return task2;
	}
}
