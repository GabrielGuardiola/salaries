package com.helloworld.salaries.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Salary {
    @Schema(description = "Id de salario", example = "1")
    private Integer id;
    @Schema(description = "Id de empleado", example = "000023")
    private String codEmpleado;
    @Schema(description = "Coste por hora", example = "6,95")
    private Double costeHora;
    @Schema(description = "Nombre de empleado", example = "2021-12-31")
    private String nombreEmpleado;
    @Schema(description = "Salario", example = "1000,00")
    private Double salary;
    @Schema(description = "Mes de salario", example = "1")
    private Integer salaryMonth;
    @Schema(description = "Año de salario", example = "2021")
    private Integer salaryYear;

}
