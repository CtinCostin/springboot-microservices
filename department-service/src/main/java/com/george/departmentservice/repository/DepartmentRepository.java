package com.george.departmentservice.repository;

import com.george.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<com.george.departmentservice.entity.Department, Long> {

    Department findByDepartmentCode(String code);

}
