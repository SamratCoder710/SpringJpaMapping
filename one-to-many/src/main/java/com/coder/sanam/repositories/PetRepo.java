package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.sanam.entities.unidirectional.Pet;

public interface PetRepo extends JpaRepository<Pet, Long> {

}
