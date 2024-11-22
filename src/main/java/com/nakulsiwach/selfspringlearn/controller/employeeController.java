package com.nakulsiwach.selfspringlearn.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeeController {

    @GetMapping("/employee")
    public String employee() {
        return "employee";
    }
}
