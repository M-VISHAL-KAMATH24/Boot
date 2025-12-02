package com.vishal.rest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    private Double salary;
    
    @Column(unique = true, nullable = false)
    private String email;
    
    private String department;
    
    // 🔥 CRITICAL: DEFAULT CONSTRUCTOR (NO ARGS) - REQUIRED BY JPA
    public Employee() {}
    
    // All-args constructor (optional)
    public Employee(String name, Double salary, String email, String department) {
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.department = department;
    }
    
    // Getters & Setters (ALL REQUIRED!)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public Double getSalary() { return salary; }
    public void setSalary(Double salary) { this.salary = salary; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}
