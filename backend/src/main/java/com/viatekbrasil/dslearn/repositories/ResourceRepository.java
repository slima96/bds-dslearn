package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
