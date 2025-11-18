package com.kamathvishal.learningRESTAPI.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.kamathvishal.learningRESTAPI.dto.StudentDto;
@RestController
public class StudentController{
    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(41,"vishal","kamathvishal26@gmail.com");
    }
}