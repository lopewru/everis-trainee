package com.example.springcoredojo.service;

import com.example.springcoredojo.entity.Student;
import com.example.springcoredojo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> getStudents() {
        return studentRepository.getStudentList();
    }
}
