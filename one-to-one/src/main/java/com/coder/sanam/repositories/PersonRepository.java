package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coder.sanam.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
