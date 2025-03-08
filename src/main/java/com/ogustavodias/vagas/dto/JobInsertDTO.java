package com.ogustavodias.vagas.dto;

import com.ogustavodias.vagas.enums.ExpLevel;
import com.ogustavodias.vagas.enums.Location;

import jakarta.validation.constraints.NotBlank;

public record JobInsertDTO(
    @NotBlank String company,
    @NotBlank String title,
    @NotBlank String description,
    @NotBlank Location location,
    @NotBlank ExpLevel expLevel) {
}
