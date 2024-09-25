package com.example.demo;

import org.sample.numberutils.Numbers;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {

        return args -> System.out.println(Numbers.add(2, 2));

    }


}
