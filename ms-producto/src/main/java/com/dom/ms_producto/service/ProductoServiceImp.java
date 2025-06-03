package com.dom.ms_producto.service;

import com.dom.ms_producto.dto.ProductoDTO;
import com.dom.ms_producto.entity.Producto;
import com.dom.ms_producto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServiceImp implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoDTO> obtenerTodos() {
        return productoRepository.findAll().stream().map(p -> {
            ProductoDTO dto = new ProductoDTO();
            dto.setCodigoProducto(p.getCodigoProducto());
            dto.setNombreProducto(p.getNombreProducto());
            dto.setPrecioProducto(p.getPrecioProducto());
            dto.setStockProducto(p.getStockProducto());
            dto.setFechaVencimiento(p.getFechaVencimiento());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public ProductoDTO obtenerPorId(Long id) {
        Producto p = productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        ProductoDTO dto = new ProductoDTO();
        dto.setCodigoProducto(p.getCodigoProducto());
        dto.setNombreProducto(p.getNombreProducto());
        dto.setPrecioProducto(p.getPrecioProducto());
        dto.setStockProducto(p.getStockProducto());
        dto.setFechaVencimiento(p.getFechaVencimiento());
        return dto;
    }

    @Override
    public ProductoDTO crearProducto(ProductoDTO dto) {
        Producto p = new Producto();
        p.setNombreProducto(dto.getNombreProducto());
        p.setPrecioProducto(dto.getPrecioProducto());
        p.setStockProducto(dto.getStockProducto());
        p.setFechaVencimiento(dto.getFechaVencimiento());
        Producto guardado = productoRepository.save(p);

        ProductoDTO respuesta = new ProductoDTO();
        respuesta.setCodigoProducto(guardado.getCodigoProducto());
        respuesta.setNombreProducto(guardado.getNombreProducto());
        respuesta.setPrecioProducto(guardado.getPrecioProducto());
        respuesta.setStockProducto(guardado.getStockProducto());
        respuesta.setFechaVencimiento(guardado.getFechaVencimiento());
        return respuesta;
    }
}
