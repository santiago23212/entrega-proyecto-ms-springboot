package com.dom.ms_venta.controller;

import com.dom.ms_venta.dto.reporteDTO.ProductoSinVentasDTO;
import com.dom.ms_venta.service.IReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reportes")
public class ReporteController {

    @Autowired
    private IReporteService reporteService;

    @GetMapping("/productos-sin-ventas")
    public List<ProductoSinVentasDTO> productosSinVentas(@RequestParam("dias") int dias) {
        return reporteService.productosSinVentasUltimosDias(dias);
    }
}
