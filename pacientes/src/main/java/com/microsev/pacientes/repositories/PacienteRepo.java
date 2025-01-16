package com.microsev.pacientes.repositories;

import com.microsev.pacientes.model.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PacienteRepo extends JpaRepository<Pacientes, Long> {

    Pacientes findByDni(String dni);
}
