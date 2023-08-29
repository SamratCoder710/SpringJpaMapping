package com.coder.sanam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Truck")
public class Truck extends Vehicle {

	private String hornSong;
	private String slogan;
	public Truck() {
		
	}
	public Truck(String modelNumber, int wheels,String hornSong, String slogan) {
		super(modelNumber,wheels);
		this.hornSong = hornSong;
		this.slogan = slogan;
	}
	
	
	
}
