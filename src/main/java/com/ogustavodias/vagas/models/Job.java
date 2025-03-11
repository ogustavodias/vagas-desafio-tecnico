package com.ogustavodias.vagas.models;

import java.util.List;

import com.ogustavodias.vagas.enums.ExpLevel;
import com.ogustavodias.vagas.enums.Location;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_jobs")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Job {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "job_id")
  private Long id;
  private String company;
  private String title;
  private String description;

  @Enumerated(EnumType.STRING)
  private Location location;

  @Enumerated(EnumType.STRING)
  private ExpLevel expLevel;

  @ManyToMany(mappedBy = "applications")
  private List<Person> applications;
}
