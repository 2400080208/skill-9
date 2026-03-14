package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.StudentNotFoundException;
import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service

public class StudentService {

@Autowired

StudentRepository repo;

public Student getStudent(int id){

Optional<Student> student=repo.findById(id);

if(student.isPresent())

return student.get();

else

throw new StudentNotFoundException("Student not found with ID "+id);

}

}