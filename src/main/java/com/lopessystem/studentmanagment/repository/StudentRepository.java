package com.lopessystem.studentmanagment.repository;

import com.lopessystem.studentmanagment.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Student repository.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
