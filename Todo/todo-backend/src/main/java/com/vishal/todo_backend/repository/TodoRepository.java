package com.vishal.todo_backend.repository;

import com.vishal.todo_backend.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    
    // Custom query methods (Spring Data JPA auto-implements!)
    List<Todo> findByCompletedFalse();
    List<Todo> findByPriority(String priority);
    List<Todo> findByCompletedTrueOrderByCreatedAtDesc();
}
