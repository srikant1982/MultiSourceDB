package com.jpa.multisource.student.repository;

import com.jpa.multisource.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
