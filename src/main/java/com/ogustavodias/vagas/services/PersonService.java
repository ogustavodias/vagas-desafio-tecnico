package com.ogustavodias.vagas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogustavodias.vagas.dto.PersonInsertDTO;
import com.ogustavodias.vagas.models.Person;
import com.ogustavodias.vagas.repositorys.PersonRepository;

@Service
public class PersonService {

  @Autowired
  private PersonRepository repository;

  public Person insertPerson(PersonInsertDTO dto) {
    Person toPersistEntity = Person.builder()
        .name(dto.name())
        .profession(dto.profession())
        .location(dto.location())
        .expLevel(dto.expLevel())
        .build();
    return repository.save(toPersistEntity);
  }

}