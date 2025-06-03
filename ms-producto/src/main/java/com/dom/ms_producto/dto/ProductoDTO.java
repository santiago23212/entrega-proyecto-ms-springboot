package com.dom.ms_producto.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class ProductoDTO {

    private Long codigoProducto;
    private String nombreProducto;
    private Double precioProducto;
    private Integer stockProducto;
    private LocalDate fechaVencimiento;

    // getters y setters
}
