package com.dom.ms_producto.service;

import com.dom.ms_producto.dto.ProductoDTO;

import java.util.List;

public interface IProductoService {
    List<ProductoDTO> obtenerTodos();
    ProductoDTO obtenerPorId(Long id);
    ProductoDTO crearProducto(ProductoDTO dto);
}
