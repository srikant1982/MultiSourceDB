package com.jpa.multisource.controller;

import com.jpa.multisource.college.repository.CollegeRepository;
import com.jpa.multisource.model.Response;
import com.jpa.multisource.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CombineController {

    private StudentRepository studentRepository;
    private CollegeRepository collegeRepository;

    public Response CollectRecords(){
        Response response = new Response();
        response.setStudents(studentRepository.findAll());
        response.setColleges(collegeRepository.findAll());
        return response;
    }
}
