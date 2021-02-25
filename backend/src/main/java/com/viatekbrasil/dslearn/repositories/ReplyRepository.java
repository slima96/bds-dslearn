package com.viatekbrasil.dslearn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viatekbrasil.dslearn.entities.Reply;

public interface ReplyRepository extends JpaRepository<Reply, Long> {

}
