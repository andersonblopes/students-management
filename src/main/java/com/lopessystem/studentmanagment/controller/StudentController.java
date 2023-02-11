package com.lopessystem.studentmanagment.controller;

import com.lopessystem.studentmanagment.model.Student;
import com.lopessystem.studentmanagment.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * The type Student controller.
 */
@Slf4j
@RequiredArgsConstructor
@Controller
public class StudentController {

    /**
     * The Student service.
     */
    private final StudentService studentService;

    /**
     * List string.
     *
     * @param model the model
     * @return the string
     */
    @GetMapping("/students")
    public String list(final Model model) {

        model.addAttribute("students", studentService.list());

        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(final Model model) {

        // Create student object to hold student form data
        final Student student = new Student();
        model.addAttribute("student", student);

        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") final Student student) {

        studentService.save(student);

        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable final Long id, final Model model) {

        final Student student = studentService.findById(id);
        model.addAttribute("student", student);

        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String edit(@PathVariable final Long id,
                       @ModelAttribute("student") final Student student,
                       final Model model) {

        final Student existingStudent = studentService.findById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        studentService.update(existingStudent);

        return "redirect:/students";
    }
}
