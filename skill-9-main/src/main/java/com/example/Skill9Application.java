package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@SpringBootApplication
public class Skill9Application {

	public static void main(String[] args) {
		SpringApplication.run(Skill9Application.class, args);
	}

	@Bean
	CommandLineRunner run(StudentRepository repo){

		return args ->{

			repo.save(new Student(1,"Suvarna","CSE"));

			repo.save(new Student(2,"Deekshu","IT"));

		};

	}

}