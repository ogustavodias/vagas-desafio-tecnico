package com.ogustavodias.vagas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogustavodias.vagas.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
