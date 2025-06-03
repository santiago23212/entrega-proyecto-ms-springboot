
package com.dom.ms_venta.dto.reporteDTO;

import lombok.Data;

@Data
public class ProductoSinVentasDTO {
    private Long codigoProducto;
    private String nombreProducto;
    private Integer stock;
    public ProductoSinVentasDTO() {}
    public ProductoSinVentasDTO(Long codigoProducto, String nombreProducto, Integer stock) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.stock = stock;
    }

}
