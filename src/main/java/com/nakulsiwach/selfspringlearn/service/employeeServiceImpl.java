package com.nakulsiwach.selfspringlearn.service;

import com.nakulsiwach.selfspringlearn.entity.employeeEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class employeeServiceImpl implements employeeService{
    ArrayList<employeeEntity> allEmployee = new ArrayList<>();

    @Override
    public void createEmployee(employeeEntity employee) {
        allEmployee.add(employee);
    }

    @Override
    public ArrayList<employeeEntity>  readEmployee() {
        return allEmployee;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        allEmployee.remove(id);
        return true;
    }

}
