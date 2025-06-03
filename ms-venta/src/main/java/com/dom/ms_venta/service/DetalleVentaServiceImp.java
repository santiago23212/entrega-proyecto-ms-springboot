package com.dom.ms_venta.service;

import com.dom.ms_venta.dto.DetalleVentaDTO;
import com.dom.ms_venta.entity.DetalleVenta;
import com.dom.ms_venta.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class DetalleVentaServiceImp implements IDetalleVentaService {
    @Autowired
    private DetalleVentaRepository detalleVentaRepository;
    @Override
    public List<DetalleVentaDTO> obtenerPorVenta(Long codigoVenta) {
        return detalleVentaRepository.findAll().stream()
            .filter(dv -> dv.getCodigoVenta().equals(codigoVenta))
            .map(dv -> {
                DetalleVentaDTO dto = new DetalleVentaDTO();
                dto.setCodigoDetalleVenta(dv.getCodigoDetalleVenta());
                dto.setCantidadProducto(dv.getCantidadProducto());
                dto.setPrecioUnitario(dv.getPrecioUnitario());
                dto.setCodigoVenta(dv.getCodigoVenta());
                dto.setCodigoProducto(dv.getCodigoProducto());
                return dto;
            })
            .collect(Collectors.toList());
    }
    @Override
    public DetalleVentaDTO crearDetalle(DetalleVentaDTO dto) {
        DetalleVenta dv = new DetalleVenta();
        dv.setCantidadProducto(dto.getCantidadProducto());
        dv.setPrecioUnitario(dto.getPrecioUnitario());
        dv.setCodigoVenta(dto.getCodigoVenta());
        dv.setCodigoProducto(dto.getCodigoProducto());
        DetalleVenta saved = detalleVentaRepository.save(dv);
        DetalleVentaDTO res = new DetalleVentaDTO();
        res.setCodigoDetalleVenta(saved.getCodigoDetalleVenta());
        res.setCantidadProducto(saved.getCantidadProducto());
        res.setPrecioUnitario(saved.getPrecioUnitario());
        res.setCodigoVenta(saved.getCodigoVenta());
        res.setCodigoProducto(saved.getCodigoProducto());
        return res;
    }
}
