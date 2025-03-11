package com.ogustavodias.vagas.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogustavodias.vagas.models.Application;


public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
