package com.ogustavodias.vagas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ogustavodias.vagas.dto.JobInsertDTO;
import com.ogustavodias.vagas.models.Job;
import com.ogustavodias.vagas.services.JobService;

@RestController
@RequestMapping(path = "/v1/jobs")
public class JobController {

  @Autowired
  private JobService service;

  @PostMapping
  public ResponseEntity<Job> insertJob(@RequestBody JobInsertDTO body) {
    Job job = service.insertJob(body);
    return ResponseEntity.status(HttpStatus.CREATED).body(job);
  }
}
