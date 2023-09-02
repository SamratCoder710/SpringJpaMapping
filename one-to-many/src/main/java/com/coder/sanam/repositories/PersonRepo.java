package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.sanam.entities.unidirectional.Person;

public interface PersonRepo extends JpaRepository<Person, Long> {

}
