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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_persons")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "person_id")
  private Long id;
  private String name;
  private String profession;

  @Enumerated(EnumType.STRING)
  private Location location;
  private ExpLevel expLevel;

  @ManyToMany
  @JoinTable(name = "tb_applications", joinColumns = @JoinColumn(name = "person_id"), inverseJoinColumns = @JoinColumn(name = "job_id"))
  private List<Job> applications;
}
