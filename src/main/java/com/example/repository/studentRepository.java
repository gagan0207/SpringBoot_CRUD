package com.example.repository;

import com.example.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<student,Integer>
        {
}
