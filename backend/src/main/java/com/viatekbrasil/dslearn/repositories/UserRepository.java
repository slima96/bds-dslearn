package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
