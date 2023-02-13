package com.lopessystem.studentmanagment.service;

import com.lopessystem.studentmanagment.model.Student;

import java.util.List;

/**
 * The interface Student service.
 */
public interface StudentService {

    /**
     * Find by id student.
     *
     * @param id the id
     * @return the student
     */
    Student findById(Long id);


    /**
     * List list.
     *
     * @return the list
     */
    List<Student> list();

    /**
     * Save student.
     *
     * @param student the student
     * @return the student
     */
    Student save(Student student);

    /**
     * Update student.
     *
     * @param student the student
     * @return the student
     */
    Student update(Student student);

    /**
     * Delete.
     *
     * @param id the id
     */
    void delete(Long id);
}
