package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.sanam.entities.bidirectional.College;

public interface CollegeRepo extends JpaRepository<College, Long> {

}
