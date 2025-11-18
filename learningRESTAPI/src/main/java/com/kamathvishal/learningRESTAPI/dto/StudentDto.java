package com.kamathvishal.learningRESTAPI.dto;
import lombok.Data;
import lombok.AllArgsConstructor;
@Data
@AllArgsConstructor
public class StudentDto{
    private long id;
    private String name;
    private String email;

}