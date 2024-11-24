package com.nakulsiwach.academicerp.repo;

import com.nakulsiwach.academicerp.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepo extends JpaRepository<Departments, Long> {
    Departments findByName(String name);
}
