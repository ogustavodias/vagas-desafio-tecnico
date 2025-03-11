package com.ogustavodias.vagas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogustavodias.vagas.models.Application;
import com.ogustavodias.vagas.models.Job;
import com.ogustavodias.vagas.models.Person;
import com.ogustavodias.vagas.repositories.ApplicationRepository;
import com.ogustavodias.vagas.repositories.JobRepository;
import com.ogustavodias.vagas.repositories.PersonRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ApplicationService {

  @Autowired
  private ApplicationRepository aRepository;

  @Autowired
  private PersonRepository pRepository;

  @Autowired
  private JobRepository jRepository;

  public Application insertApplication(Long personId, Long jobId) {
    Person person = pRepository.findById(personId).orElseThrow(() -> new EntityNotFoundException("Person not found"));
    Job job = jRepository.findById(jobId).orElseThrow(() -> new EntityNotFoundException("Job not found"));

    Application toPersistEntity = Application.builder()
        .person(person)
        .job(job)
        .build();

    return aRepository.save(toPersistEntity);
  }
}
