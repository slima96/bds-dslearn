package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.Enrollment;
import com.viatekbrasil.dslearn.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {

}
