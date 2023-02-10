package com.lopessystem.studentmanagment.service;

import com.lopessystem.studentmanagment.model.Student;
import org.springframework.stereotype.Service;

/**
 * The interface Student service.
 */
@Service
public interface StudentService {

    /**
     * Find by id student.
     *
     * @param id the id
     * @return the student
     */
    Student findById(Long id);
}
