package com.school.schoolmanager.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.SEPTEMBER;

@Configuration
public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student thanuj = new Student(
                  "Thanuja Fernando",
                  "thanuj@gmail.com",
                  LocalDate.of(2001,SEPTEMBER, 22),
                  22
          );

            Student bishen = new Student(
                    "Bishen Fernando",
                    "bishen@gmail.com",
                    LocalDate.of(2001,SEPTEMBER, 15),
                    22
            );

            repository.saveAll(
                    List.of(thanuj,bishen)
            );
        };
    }
}
