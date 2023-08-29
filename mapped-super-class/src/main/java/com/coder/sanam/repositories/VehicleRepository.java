package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.coder.sanam.entities.Vehicle;


@NoRepositoryBean
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

}
