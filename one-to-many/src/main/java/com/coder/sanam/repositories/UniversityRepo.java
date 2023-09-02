package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.sanam.entities.bidirectional.University;

public interface UniversityRepo extends JpaRepository<University, Long> {

}
