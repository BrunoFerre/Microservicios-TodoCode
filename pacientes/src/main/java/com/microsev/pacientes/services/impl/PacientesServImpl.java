package com.microsev.pacientes.services.impl;

import com.microsev.pacientes.dto.GetPacienteDTO;
import com.microsev.pacientes.model.Pacientes;
import com.microsev.pacientes.repositories.PacienteRepo;
import com.microsev.pacientes.services.PacienteServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientesServImpl implements PacienteServ {
    @Autowired
    private PacienteRepo pacienteRepo;

    @Override
    public List<GetPacienteDTO> findAll() {
        return pacienteRepo.findAll().stream().map(GetPacienteDTO::new).toList();
    }

    @Override
    public Pacientes findById(Long id) {
        return pacienteRepo.findById(id).orElse(null);
    }

    @Override
    public Pacientes save(Pacientes paciente) {
        return pacienteRepo.save(paciente);
    }

    @Override
    public void editPaciente(Pacientes paciente) {
        pacienteRepo.save(paciente);
    }

    @Override
    public void delete(Long id) {
        pacienteRepo.deleteById(id);
    }

    @Override
    public Pacientes findByDni(String dni) {
        return pacienteRepo.findByDni(dni);
    }
}
