package com.helloworld.salaries.company.salary.services.impl;

import com.helloworld.salaries.company.salary.services.EmployeeService;
import com.helloworld.salaries.mappers.EmployeeMapper;
import com.helloworld.salaries.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<Employee> getEmployee(String name, String codEmployee, Integer offset, Integer pageSize) {
        return this.employeeMapper.getEmployeeByCodEmployee(name, codEmployee, offset, pageSize);
    }


}
