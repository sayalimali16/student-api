
package com.example.student_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class StudentApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApiApplication.class, args);
    }

    @GetMapping("/student")
    public String getStudent() {
        return "Student Name: Sayali, Roll No:37";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Welcome to REST API!";
    }
}
