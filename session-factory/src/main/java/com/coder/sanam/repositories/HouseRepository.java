package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coder.sanam.entities.House;

@Repository
public interface HouseRepository extends JpaRepository<House,Long> {

}
