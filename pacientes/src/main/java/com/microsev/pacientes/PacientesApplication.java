package com.microsev.pacientes;

import com.microsev.pacientes.model.Pacientes;
import com.microsev.pacientes.repositories.PacienteRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class PacientesApplication {

    public static void main(String[] args) {
        SpringApplication.run(PacientesApplication.class, args);
    }

  /*  @Bean
    public CommandLineRunner run(PacienteRepo pacienteRepo) {
        return args -> {
            Pacientes juan = new Pacientes("12345678A", "Juan", "Perez", "123456789", LocalDate.now());
            Pacientes maria = new Pacientes("87654321B", "Maria", "Lopez", "987654321",LocalDate.now());
            Pacientes pedro = new Pacientes("11111111C", "Pedro", "Garcia", "111111111",LocalDate.now());
            pacienteRepo.save(juan);
            pacienteRepo.save(maria);
            pacienteRepo.save(pedro);
        };
    }*/
}
