package com.nakulsiwach.academicerp.repo;

import com.nakulsiwach.academicerp.entity.EmployeeSalary;
import com.nakulsiwach.academicerp.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeSalaryRepo extends JpaRepository<EmployeeSalary, Long> {
    EmployeeSalary findByEmployee(Employees employee);
}
