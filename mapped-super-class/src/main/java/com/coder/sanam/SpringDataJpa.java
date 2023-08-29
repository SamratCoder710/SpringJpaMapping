package com.coder.sanam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.coder.sanam.entities.Car;
import com.coder.sanam.entities.Truck;
import com.coder.sanam.entities.Vehicle;
import com.coder.sanam.repositories.CarRepository;
import com.coder.sanam.repositories.TruckRepository;
import com.coder.sanam.repositories.VehicleRepository;

@SpringBootApplication
public class SpringDataJpa {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpa.class, args);
		VehicleRepository truckRepository = ctx.getBean(TruckRepository.class);
		
		VehicleRepository carRepository = ctx.getBean(CarRepository.class);
		
		Vehicle truck = new Truck("RET1", 12, "Main nikla gaddi leke", "Jinko Jaldi thi wo chale gye");
		Vehicle car = new Car("SUV", 4, true, "Sports");
		
		truckRepository.save(truck);
		carRepository.save(car);

	}

}
