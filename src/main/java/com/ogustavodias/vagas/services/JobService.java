package com.ogustavodias.vagas.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogustavodias.vagas.dto.JobInsertDTO;
import com.ogustavodias.vagas.dto.PersonWithScoreDTO;
import com.ogustavodias.vagas.models.DistanceCoordenates;
import com.ogustavodias.vagas.models.Job;
import com.ogustavodias.vagas.models.Person;
import com.ogustavodias.vagas.repositorys.JobRepository;

import jakarta.persistence.EntityNotFoundException;

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

  public List<PersonWithScoreDTO> getPersonsAppliedInJobOrderedByScoreDesc(Long jobId) {
    Job job = repository.findById(jobId).orElseThrow(() -> new EntityNotFoundException("Job not found"));
    List<PersonWithScoreDTO> personsWithScore = new ArrayList<>();

    for (Person person : job.getApplications()) {
      Integer nScore = 100 - 25 * Math.abs(job.getExpLevel().getCod() - person.getExpLevel().getCod());
      Integer dScore = DistanceCoordenates.getScoreOfDistance(job.getLocation().name(), person.getLocation().name());
      Integer score = (nScore + dScore) / 2;
      personsWithScore.add(PersonWithScoreDTO.fromPersonEntity(person, score));
    }

    personsWithScore.sort(Comparator.comparingInt(PersonWithScoreDTO::score).reversed());

    return personsWithScore;
  }

}
