package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student godofredo = new Student(
                    "Godofredo",
                    "godofredo@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 15),
                    21
            );

            Student dilma = new Student(
                    "Dilma",
                    "dilma.opressora@gmail.com",
                    LocalDate.of(1957, Month.JUNE, 13),
                    63
            );
            studentRepository.saveAll(
                    List.of(
                            godofredo, dilma));
        };
    }
}
