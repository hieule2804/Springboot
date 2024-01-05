package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class studentConfig {
    @Bean
    CommandLineRunner conCommandLineRunner(studentRepository repository){
        return args -> {
            student hieu = new student("hieu" ,20, LocalDate.of(2003, Month.APRIL,28),"hieu280423");
            student hanh = new student("hanh" ,20, LocalDate.of(2003, Month.SEPTEMBER,29),"...");
             repository.saveAll(List.of(hieu,hanh));
        };

    }
}
