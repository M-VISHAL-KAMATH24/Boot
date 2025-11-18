package com.kamathvishal.learningRESTAPI.repository;
import com.kamathvishal.learningRESTAPI.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long>{

    
}
