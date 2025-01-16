package com.microsev.pacientes.controller;

import com.microsev.pacientes.dto.GetPacienteDTO;
import com.microsev.pacientes.model.Pacientes;
import com.microsev.pacientes.repositories.PacienteRepo;
import com.microsev.pacientes.services.PacienteServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pacientes")
public class PacientesController {
    @Autowired
    private PacienteServ pacienteServ;
    @Autowired
    private PacienteRepo repo;

    //1. Crear Pacientes
    @PostMapping("/crear")
    public ResponseEntity<Object> crearPaciente(@RequestBody Pacientes paciente) {
        try {
            return ResponseEntity.ok(pacienteServ.save(paciente));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //2. Listar Pacientes
    @GetMapping("/listar")
    public ResponseEntity<Object> listarPacientes() {
        try {
            List<GetPacienteDTO> pacientes = pacienteServ.findAll();
            return new ResponseEntity<>(pacientes, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //3.Eliminar Paciente por ID
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Object> eliminarPaciente(@PathVariable Long id) {
        try {
            pacienteServ.delete(id);
            return ResponseEntity.ok("Paciente eliminado correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    //4. Actualizar Paciente
    @PutMapping("/actualizar")
    public ResponseEntity<Object> actualizarPaciente(@RequestBody Pacientes paciente) {
        try {
            return ResponseEntity.ok(pacienteServ.save(paciente));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/traerdni/{dni}")
    public ResponseEntity<Object> buscarPacientePorDni(@PathVariable String dni) {
        try {
            return ResponseEntity.ok(pacienteServ.findByDni(dni));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
