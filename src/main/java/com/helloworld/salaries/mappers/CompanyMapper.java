package com.helloworld.salaries.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface CompanyMapper {

    @Select("SELECT AVG(SALARY) FROM salary WHERE SALARYYEAR = #{year}")
    double getAvgSalary(int year);

}
