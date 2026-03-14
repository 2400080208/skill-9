package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.exception.InvalidInputException;
import com.example.model.Student;
import com.example.service.StudentService;

@RestController

public class StudentController {

@Autowired

StudentService service;

@GetMapping("/student/{id}")

public Student getStudent(@PathVariable String id){

try{

int sid=Integer.parseInt(id);

if(sid<=0)

throw new InvalidInputException("ID must be positive");

return service.getStudent(sid);

}

catch(NumberFormatException e){

throw new InvalidInputException("ID must be number");

}

}

}