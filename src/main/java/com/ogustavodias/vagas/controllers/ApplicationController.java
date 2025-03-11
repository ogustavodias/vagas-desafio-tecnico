package com.ogustavodias.vagas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ogustavodias.vagas.models.Application;
import com.ogustavodias.vagas.services.ApplicationService;

@RestController
@RequestMapping(path = "/v1/applications")
public class ApplicationController {

  @Autowired
  private ApplicationService service;

  @PostMapping
  public ResponseEntity<Application> insertApplication(@RequestParam Long personId, @RequestParam Long jobId) {
    Application application = service.insertApplication(personId, jobId);
    return ResponseEntity.status(HttpStatus.CREATED).body(application);
  }

}
