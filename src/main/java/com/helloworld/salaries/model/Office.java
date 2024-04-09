package com.helloworld.salaries.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Office {
    @Schema(description = "Id de oficina", example = "1")
    private Integer id;
    @Schema(description = "Nombre de oficina", example = "Madrid")
    private String name;
    @Schema(description = "Dirección de oficina", example = "Calle de la piruleta")
    private String city;
    @Schema(description = "Código postal", example = "28001")
    private String postalCode;
    @Schema(description = "Codigo país", example = "ES")
    private String country_code;
    @Schema(description = "Central", example = "1")
    private Boolean headquarter;
    @Schema(description = "Continente", example = "Europa")
    private String continent;
}
