package com.jpa.multisource.college.repository;

import com.jpa.multisource.college.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Integer> {
}
