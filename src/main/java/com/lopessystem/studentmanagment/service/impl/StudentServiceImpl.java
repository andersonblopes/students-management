package com.lopessystem.studentmanagment.service.impl;

import com.lopessystem.studentmanagment.model.Student;
import com.lopessystem.studentmanagment.repository.StudentRepository;
import com.lopessystem.studentmanagment.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * The type Student service.
 */
@Slf4j
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    /**
     * The Student repository.
     */
    private final StudentRepository studentRepository;

    /**
     * Find by id student.
     *
     * @param id the id
     * @return the student
     */
    @Override
    public Student findById(final Long id) {

        log.info("findById");
        log.info("id: {}", id);

        return studentRepository.findById(id).orElse(null);
    }
}
