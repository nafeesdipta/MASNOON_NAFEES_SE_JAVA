package com.sweet.springboot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="component")
public class Task implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String ram;
	private String motherboard;
	private boolean complete;
	
	public Task(){
		
	}

	public Task(String ram, String motherboard, boolean complete) {
		super();
		this.ram = ram;
		this.motherboard = motherboard;
		this.complete = complete;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", ram=" + ram + ", motherboard=" + motherboard + ", complete=" + complete + "]";
	}
	
}
