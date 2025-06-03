package com.dom.ms_venta.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Table(name = "ventas")
@Data
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_venta", nullable = false)
    private Long codigoVenta;
    @Column(name = "documento_empleado")
    private Long documentoEmpleado;
    @Column(name = "fecha_venta")
    private LocalDate fechaVenta;
    @Column(name = "total_venta")
    private Double totalVenta;

}
