package com.java.findworks.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.findworks.backend.data.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
