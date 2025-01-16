package com.microsev.turno.service;

import com.microsev.turno.model.Turno;

import java.time.LocalDate;
import java.util.List;

public interface TurnoService {
    List<Turno> getTurnos();

    void save(LocalDate fecha, String tratamiento, String dniPaciente);

    void delete(Long id);

    Turno findById(Long id);

    void update(Long id, Turno turno);
}
