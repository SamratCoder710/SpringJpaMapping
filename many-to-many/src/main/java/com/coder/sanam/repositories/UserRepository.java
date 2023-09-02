package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coder.sanam.entities.unidirectional.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
