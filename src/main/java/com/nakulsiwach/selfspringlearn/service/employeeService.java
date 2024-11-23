package com.nakulsiwach.selfspringlearn.service;

import com.nakulsiwach.selfspringlearn.entity.employeeEntity;

import java.util.ArrayList;
import java.util.List;

public interface employeeService {

    void createEmployee(employeeEntity employee);

    ArrayList<employeeEntity> readEmployee();

    boolean deleteEmployee(Long id);
}
