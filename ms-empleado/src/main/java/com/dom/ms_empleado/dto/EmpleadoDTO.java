package com.dom.ms_empleado.dto;

import lombok.Data;

@Data
public class EmpleadoDTO {

    private Long documentoEmpleado;
    private String nombreEmpleado;
    private String apellido1Empleado;
    private String apellido2Empleado;

    // getters y setters
}
