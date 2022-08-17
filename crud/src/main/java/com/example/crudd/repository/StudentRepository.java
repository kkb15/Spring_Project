package com.example.crudd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudd.entity.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student, Long>{

}
