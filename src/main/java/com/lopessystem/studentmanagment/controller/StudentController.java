package com.lopessystem.studentmanagment.controller;

import com.lopessystem.studentmanagment.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
