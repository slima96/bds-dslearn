package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
