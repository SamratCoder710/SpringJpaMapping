package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coder.sanam.entities.Family;

@Repository
public interface FamilyRepository extends JpaRepository<Family,Long> {

}
