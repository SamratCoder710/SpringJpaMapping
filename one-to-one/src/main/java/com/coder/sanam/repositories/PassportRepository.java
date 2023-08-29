package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coder.sanam.entities.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport,Long> {

}
