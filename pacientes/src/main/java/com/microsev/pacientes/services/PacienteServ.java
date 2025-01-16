package com.microsev.pacientes.services;

import com.microsev.pacientes.dto.GetPacienteDTO;
import com.microsev.pacientes.model.Pacientes;

import java.util.List;

public interface PacienteServ {
    public List<GetPacienteDTO> findAll();

    public Pacientes findById(Long id);

    public Pacientes save(Pacientes paciente);

    public void editPaciente(Pacientes paciente);

    public void delete(Long id);
    public Pacientes findByDni(String dni);
}
