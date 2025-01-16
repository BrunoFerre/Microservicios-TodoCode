package com.microsev.turno.controller;

import com.microsev.turno.dtos.TurnoDTO;
import com.microsev.turno.model.Turno;
import com.microsev.turno.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/turno")
public class TurnoController {
    @Autowired
    private TurnoService turnoService;

    @PostMapping
    public ResponseEntity<Object> saveTurno(@RequestBody TurnoDTO turno) {
        try {
            turnoService.save(turno.getFecha(), turno.getTratamiento(), turno.getDni());
            return ResponseEntity.ok().body("Turno guardado");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al guardar turno");
        }
    }

    @GetMapping("/traer")
    public ResponseEntity<Object> getTurnos() {
        try {
            return ResponseEntity.ok().body(turnoService.getTurnos());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al traer los turnos");
        }
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<Object> deleteTurno(@PathVariable Long id) {
        try {
            turnoService.delete(id);
            return ResponseEntity.ok().body("Turno eliminado");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al eliminar turno");
        }
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Object> updateTurno(@PathVariable Long id, @RequestBody Turno turno) {
        try {
            turnoService.update(id, turno);
            Turno turnoEdit = turnoService.findById(id);
            return ResponseEntity.ok().body(turnoEdit);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al actualizar turno");
        }
    }

    @GetMapping("/traer/{id}")
    public ResponseEntity<Object> getTurno(@PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(turnoService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al traer el turno");
        }
    }
}
