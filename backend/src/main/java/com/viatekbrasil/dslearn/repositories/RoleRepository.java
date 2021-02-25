package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
