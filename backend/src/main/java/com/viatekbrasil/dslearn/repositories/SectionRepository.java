package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.Section;

public interface SectionRepository extends JpaRepository<Section, Long> {

}
