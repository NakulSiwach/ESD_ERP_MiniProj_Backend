package com.nakulsiwach.academicerp.repo;

import com.nakulsiwach.academicerp.entity.EmployeeAccounts;
import com.nakulsiwach.academicerp.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeAccountsRepo extends JpaRepository<EmployeeAccounts, Long> {
    EmployeeAccounts findByEmployee(Employees employee);
}
