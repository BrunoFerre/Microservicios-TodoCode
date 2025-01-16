package com.microsev.turno.service.impl;

import com.microsev.turno.model.Pacientes;
import com.microsev.turno.model.Turno;
import com.microsev.turno.repositories.TurnoRepository;
import com.microsev.turno.service.TurnoService;
import org.hibernate.annotations.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;

@Service
public class TurnoServiceImpl implements TurnoService {
    @Autowired
    private TurnoRepository turnoRepository;
    @Autowired
    private RestTemplate apiConsumir;

    @Override
    public List<Turno> getTurnos() {
        return turnoRepository.findAll();
    }

    @Override
    public void save(LocalDate fecha, String tratamiento, String dniPaciente) {
        // buscar paciente por dni
        Pacientes paciente = apiConsumir.getForObject("http://localhost:9001/api/pacientes/traerdni/" + dniPaciente, Pacientes.class);
        assert paciente != null;
        String nombrePaciente = paciente.getNombre() + " " + paciente.getApellido();
        Turno turno = new Turno();
        turno.setFecha(fecha);
        turno.setTratamiento(tratamiento);
        turno.setNombrePaciente(nombrePaciente);
        turnoRepository.save(turno);

    }

    @Override
    public void delete(Long id) {
        turnoRepository.deleteById(id);
    }

    @Override
    public Turno findById(Long id) {
        return turnoRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Long id, Turno turno) {
        Turno turno1 = this.findById(id);
        turno1.setFecha(turno.getFecha());
        turno1.setTratamiento(turno.getTratamiento());
        turno1.setNombrePaciente(turno.getNombrePaciente());
        turnoRepository.save(turno1);
    }
}
