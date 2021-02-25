package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
