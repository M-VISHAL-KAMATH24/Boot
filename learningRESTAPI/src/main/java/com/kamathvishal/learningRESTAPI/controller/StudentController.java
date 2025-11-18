package com.kamathvishal.learningRESTAPI.controller;

import com.kamathvishal.learningRESTAPI.entity.Student;
import com.kamathvishal.learningRESTAPI.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }
}
