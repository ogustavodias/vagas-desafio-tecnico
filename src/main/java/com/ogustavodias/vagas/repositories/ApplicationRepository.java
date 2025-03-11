package com.ogustavodias.vagas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogustavodias.vagas.models.Application;


public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
