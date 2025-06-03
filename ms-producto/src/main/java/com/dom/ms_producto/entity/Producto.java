package com.dom.ms_producto.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_producto", nullable = false)
    private Long codigoProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "precio_producto")
    private Double precioProducto;

    @Column(name = "stock_producto")
    private Integer stockProducto;

    @Column(name = "fecha_vencimiento")
    private LocalDate fechaVencimiento;

    // getters y setters
}
