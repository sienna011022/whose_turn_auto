package com.example.study_auto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyAutoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyAutoApplication.class, args);
        Auto auto = new Auto();
        auto.getTurn();

    }

}
