package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {

}
