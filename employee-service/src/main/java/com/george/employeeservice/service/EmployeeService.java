package com.george.employeeservice.service;

import com.george.employeeservice.dto.APIResponseDto;
import com.george.employeeservice.dto.EmployeeDto;

public interface EmployeeService {

    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
