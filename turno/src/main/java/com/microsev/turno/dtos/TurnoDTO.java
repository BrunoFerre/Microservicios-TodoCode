package com.microsev.turno.dtos;

import java.time.LocalDate;

public class TurnoDTO {
    private LocalDate fecha;
    private String tratamiento;
    private String dni;

    public TurnoDTO() {
    }

    public TurnoDTO(LocalDate fecha, String tratamiento, String dni) {
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
