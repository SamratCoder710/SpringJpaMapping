package com.coder.sanam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coder.sanam.entities.unidirectional.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

}
