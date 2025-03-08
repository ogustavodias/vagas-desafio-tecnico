package com.ogustavodias.vagas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogustavodias.vagas.dto.JobInsertDTO;
import com.ogustavodias.vagas.models.Job;
import com.ogustavodias.vagas.repositorys.JobRepository;

@Service
public class JobService {

  @Autowired
  private JobRepository repository;

  public Job insertJob(JobInsertDTO dto) {
    Job toPersistEntity = Job.builder()
        .company(dto.company())
        .title(dto.title())
        .description(dto.description())
        .location(dto.location())
        .expLevel(dto.expLevel())
        .build();
    return repository.save(toPersistEntity);
  }
}
