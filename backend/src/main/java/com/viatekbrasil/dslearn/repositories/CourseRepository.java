package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
