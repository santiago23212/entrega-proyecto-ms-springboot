package com.dom.ms_venta.service;

import com.dom.ms_venta.dto.DetalleVentaDTO;

import java.util.List;
public interface IDetalleVentaService {
    List<DetalleVentaDTO> obtenerPorVenta(Long codigoVenta);
    DetalleVentaDTO crearDetalle(DetalleVentaDTO dto);
}
