package com.coder.sanam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String modelNumber;
	
	private int wheels;

	public Vehicle() {
		
	}

	public Vehicle(String modelNumber, int wheels) {
		this.modelNumber = modelNumber;
		this.wheels = wheels;
	}
	
	
	

}
