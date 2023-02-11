package com.lopessystem.studentmanagment;

import com.lopessystem.studentmanagment.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Student management application.
 */
@RequiredArgsConstructor
@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

    /**
     * The Student repository.
     */
    private final StudentRepository studentRepository;

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(final String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

    /**
     * Run.
     *
     * @param args the args
     * @throws Exception the exception
     */
    @Override
    public void run(final String... args) throws Exception {
/*
        final Student anderson = new Student(1L, "Anderson", "Lopes", "anderson@email.com", OffsetDateTime.now(), Boolean.TRUE);
        final Student elaine = new Student(2L, "Elaine", "Lopes", "elaine@email.com", OffsetDateTime.now(), Boolean.TRUE);
        final Student helena = new Student(3L, "Halena", "Lopes", "helena@email.com", OffsetDateTime.now(), Boolean.TRUE);

        studentRepository.saveAll(Arrays.asList(anderson, elaine, helena));
*/
    }
}
