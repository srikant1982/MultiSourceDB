package com.jpa.multisource.model;

import com.jpa.multisource.college.entity.College;
import com.jpa.multisource.student.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    List<Student> students;
    List<College> colleges;
}
