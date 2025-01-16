package com.microsev.turno;

import com.microsev.turno.model.Turno;
import com.microsev.turno.repositories.TurnoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class TurnoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TurnoApplication.class, args);
    }

 /*   @Bean
    public CommandLineRunner runner(TurnoRepository turnoRepository) {
        return args -> {
            Turno turno = new Turno(LocalDate.now(), "Tratamiento-1", "Juan Perez");
            turnoRepository.save(turno);
        };
    }*/
}
