package com.dom.ms_empleado.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @Column(name = "documento_empleado", nullable = false)
    private Long documentoEmpleado;

    @Column(name = "nombre_empleado")
    private String nombreEmpleado;

    @Column(name = "apellido1_empleado")
    private String apellido1Empleado;

    @Column(name = "apellido2_empleado")
    private String apellido2Empleado;

    // getters y setters
}
