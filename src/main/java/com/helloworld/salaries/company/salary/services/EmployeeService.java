package com.helloworld.salaries.company.salary.services;

import com.helloworld.salaries.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployee(String name, String codEmployee, Integer offset, Integer pageSize);
}
