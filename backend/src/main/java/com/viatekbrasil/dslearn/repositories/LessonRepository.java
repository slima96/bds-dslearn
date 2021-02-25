package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
