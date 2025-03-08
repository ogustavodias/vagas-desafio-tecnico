package com.ogustavodias.vagas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ogustavodias.vagas.dto.PersonInsertDTO;
import com.ogustavodias.vagas.models.Person;
import com.ogustavodias.vagas.services.PersonService;

@RestController
@RequestMapping(path = "/v1/persons")
public class PersonController {

  @Autowired
  private PersonService service;

  @PostMapping
  public ResponseEntity<Person> insertPerson(@RequestBody PersonInsertDTO body) {
    Person person = service.insertPerson(body);
    return ResponseEntity.status(HttpStatus.CREATED).body(person);
  }

}
