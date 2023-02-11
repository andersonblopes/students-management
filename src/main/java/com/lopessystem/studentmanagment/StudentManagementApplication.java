package com.lopessystem.studentmanagment;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Student management application.
 */
@RequiredArgsConstructor
@SpringBootApplication
public class StudentManagementApplication {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(final String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

}
