package com.dom.ms_venta.service;

import com.dom.ms_venta.dto.reporteDTO.ProductoSinVentasDTO;

import java.util.List;
public interface IReporteService {
    List<ProductoSinVentasDTO> productosSinVentasUltimosDias(int dias);
}
