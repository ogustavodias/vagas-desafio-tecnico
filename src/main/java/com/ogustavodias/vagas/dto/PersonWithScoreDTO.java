package com.ogustavodias.vagas.dto;

import com.ogustavodias.vagas.enums.ExpLevel;
import com.ogustavodias.vagas.enums.Location;
import com.ogustavodias.vagas.models.Person;

public record PersonWithScoreDTO(
        String name,
        String profession,
        Location location,
        ExpLevel expLevel,
        Integer score) {

    public static PersonWithScoreDTO fromPersonEntity(Person person, Integer score) {
        return new PersonWithScoreDTO(
                person.getName(),
                person.getProfession(),
                person.getLocation(),
                person.getExpLevel(),
                score);
    }
}
