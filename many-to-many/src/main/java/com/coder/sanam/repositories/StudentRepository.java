package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coder.sanam.entities.bidirectional.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
