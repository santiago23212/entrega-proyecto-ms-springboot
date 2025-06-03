package com.dom.ms_venta.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "detalle_venta")
@Data
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_detalleventa", nullable = false)
    private Long codigoDetalleVenta;
    @Column(name = "cantidad_producto")
    private Integer cantidadProducto;
    @Column(name = "precio_unitario")
    private Double precioUnitario;
    @Column(name = "codigo_venta")
    private Long codigoVenta;
    @Column(name = "codigo_producto")
    private Long codigoProducto;

}
