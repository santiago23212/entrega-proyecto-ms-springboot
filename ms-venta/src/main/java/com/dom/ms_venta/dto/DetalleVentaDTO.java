package com.dom.ms_venta.dto;

import lombok.Data;

@Data
public class DetalleVentaDTO {
    private Long codigoDetalleVenta;
    private Integer cantidadProducto;
    private Double precioUnitario;
    private Long codigoVenta;
    private Long codigoProducto;

}
