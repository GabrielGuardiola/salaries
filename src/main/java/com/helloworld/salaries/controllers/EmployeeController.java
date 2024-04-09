package com.helloworld.salaries.controllers;

import com.helloworld.salaries.company.salary.services.EmployeeService;
import com.helloworld.salaries.mappers.EmployeeMapper;
import com.helloworld.salaries.model.Employee;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final Integer PAGE_SIZE = 10;
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeCode}/salary/{year}")
    @Operation(summary = "Get employee salary for a year")
    public ResponseEntity<?> getEmployeeSalary(@PathVariable String employeeCode, @PathVariable int year) {
        return ResponseEntity.ok(10000D);
    }

    @PostMapping("/{employeeCode}/salary/{year}")
    @Operation(summary = "Set employee salary for a year")
    public ResponseEntity<?> setEmployeeSalary(@PathVariable String employeeCode, @PathVariable int year) {
        return ResponseEntity.ok(10000D);
    }

    @GetMapping("")
    @Operation(summary = "Get employee(s)")
    public ResponseEntity<Map<String, List<Employee>>> getEmployee(@RequestParam String name,
                                                                   @RequestParam String codEmployee,
                                                                   @RequestParam(defaultValue = "1") int page) {

        Integer offset = page * PAGE_SIZE;
        List<Employee> employees = new ArrayList<>();
        employees = employeeService.getEmployee(name, codEmployee, offset, PAGE_SIZE);
        return ResponseEntity.ok(Map.of("employees", employees));
    }

    @PutMapping("/{employeeCode}/salary/{year}/month/{month}")
    @Operation(summary = "Set employee salary for a month")
    public ResponseEntity<?> setEmployeeSalaryMonth(@PathVariable String employeeCode, @PathVariable int year, @PathVariable int month) {
        return ResponseEntity.ok(10000D);
    }



}
