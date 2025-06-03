package com.dom.ms_venta.service;

import com.dom.ms_venta.dto.ProductoDTO;
import com.dom.ms_venta.dto.reporteDTO.ProductoSinVentasDTO;
import com.dom.ms_venta.feign.ProductoFeignClient;
import com.dom.ms_venta.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ReporteServiceImpl implements IReporteService {
    @Autowired
    private DetalleVentaRepository detalleVentaRepository;
    @Autowired
    private ProductoFeignClient productoFeignClient;
    @Override
    public List<ProductoSinVentasDTO> productosSinVentasUltimosDias(int dias) {
        LocalDate fechaLimite = LocalDate.now().minusDays(dias);
        List<Long> ids = detalleVentaRepository.findProductosSinVentasDesde(fechaLimite);
        return ids.stream().map(id -> {
            ProductoDTO p = productoFeignClient.getProductoById(id);
            return new ProductoSinVentasDTO(p.getCodigoProducto(), p.getNombreProducto(), p.getStockProducto());
        }).collect(Collectors.toList());
    }
}
