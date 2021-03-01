package com.microservice.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.model.ERole;
import com.microservice.model.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}