package com.coder.sanam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Car")
public class Car extends Vehicle {

	private Boolean airConditioned;
	
	private String type;

	public Car() {
	}

	public Car(String modelNumber, int wheels, Boolean airConditioned, String type) {
		super(modelNumber, wheels);
		this.airConditioned = airConditioned;
		this.type = type;
	}
	
	
}
