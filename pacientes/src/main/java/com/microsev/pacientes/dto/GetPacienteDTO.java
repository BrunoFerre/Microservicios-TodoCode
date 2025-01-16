package com.microsev.pacientes.dto;

import com.microsev.pacientes.model.Pacientes;


import java.time.LocalDate;


public class GetPacienteDTO {
    private Long id;
    private String dni, nombre, apellido, telefono;
    private LocalDate fechaNacimiento;

    public GetPacienteDTO() {
    }

    public GetPacienteDTO(Pacientes paciente) {
        this.id = paciente.getId();
        this.dni = paciente.getDni();
        this.nombre = paciente.getNombre();
        this.apellido = paciente.getApellido();
        this.telefono = paciente.getTelefono();
        this.fechaNacimiento = paciente.getFechaNacimiento();
    }

    public Long getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
