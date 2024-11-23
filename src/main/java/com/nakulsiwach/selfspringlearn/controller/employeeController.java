package com.nakulsiwach.selfspringlearn.controller;
import com.nakulsiwach.selfspringlearn.entity.employeeEntity;
import com.nakulsiwach.selfspringlearn.service.employeeService;
import com.nakulsiwach.selfspringlearn.service.employeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;



@RestController
public class employeeController {

    @Autowired
    employeeService empService ;

    @GetMapping("employee")
    public ArrayList<employeeEntity>  employee() {
        return empService.readEmployee();
    }

    @PostMapping("employee")
    public void addEmployee(@RequestBody employeeEntity employee) {
        empService.createEmployee(employee);
        System.out.println("Added Success");
    }

    //path variable
    @DeleteMapping("employee/{id}")
    public String deleteEmployee(@PathVariable long id) {
        if(empService.deleteEmployee(id)) return "Delete Done";
        return "Delete NOT DONE";
    }
}
