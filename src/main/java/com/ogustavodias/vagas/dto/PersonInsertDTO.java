package com.ogustavodias.vagas.dto;

import com.ogustavodias.vagas.enums.ExpLevel;
import com.ogustavodias.vagas.enums.Location;

import jakarta.validation.constraints.NotBlank;

public record PersonInsertDTO(
    @NotBlank String name,
    @NotBlank String profession,
    @NotBlank Location location,
    @NotBlank ExpLevel expLevel) {
}
