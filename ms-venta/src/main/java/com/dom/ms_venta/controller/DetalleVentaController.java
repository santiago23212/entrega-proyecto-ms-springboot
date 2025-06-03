package com.dom.ms_venta.controller;

import com.dom.ms_venta.dto.DetalleVentaDTO;
import com.dom.ms_venta.service.IDetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/detalle-ventas")
public class DetalleVentaController {
    @Autowired
    private IDetalleVentaService detalleVentaService;
    @GetMapping("/venta/{codVenta}")
    public List<DetalleVentaDTO> obtenerPorVenta(@PathVariable("codVenta") Long codVenta) {
        return detalleVentaService.obtenerPorVenta(codVenta);
    }
    @PostMapping
    public DetalleVentaDTO crear(@RequestBody DetalleVentaDTO dto) {
        return detalleVentaService.crearDetalle(dto);
    }
}
