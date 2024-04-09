package com.helloworld.salaries.mappers;

import com.helloworld.salaries.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM employee WHERE NOMBREEMPLEADO like CONCAT('%', #{name}, '%') AND CODEMPLEADO LIKE CONCAT('%', #{codEmployee}, '%') limit #{pageSize} offset #{offset}")
    List<Employee> getEmployeeByCodEmployee(String name, String codEmployee, Integer offset, Integer pageSize);
}
