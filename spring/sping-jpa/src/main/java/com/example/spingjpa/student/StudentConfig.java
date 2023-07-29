package com.example.spingjpa.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student melika = new Student(
                    "Melika ATA",
                    "melika.ata@gmail.com",
                    19
            );

            Student ali = new Student(
                    "Ali Shahidi",
                    "alishahidi1376@gmail.com",
                    19
            );

//            repository.saveAll(
//                    List.of(melika, ali)
//            );
        };
    }

}
