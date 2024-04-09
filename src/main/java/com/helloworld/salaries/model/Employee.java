package com.helloworld.salaries.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    @Schema(description = "Id de empleado", example = "000023")
    private String codEmpleado;
    @Schema(description = "Nombre de empleado", example = "Juan")
    private String nombreEmpleado;
    @Schema(description = "Fecha de inicio", example = "2021-01-01")
    private Date fechaInicio;
    @Schema(description = "Fecha de fin", example = "2021-12-31")
    private Date fechaFin;
    @Schema(description = "Id de oficina", example = "1")
    private Integer office;
}
