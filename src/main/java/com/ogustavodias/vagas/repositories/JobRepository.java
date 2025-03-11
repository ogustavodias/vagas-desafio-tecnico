package com.ogustavodias.vagas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogustavodias.vagas.models.Job;

public interface JobRepository extends JpaRepository<Job, Long> {

  

}
