package com.dom.ms_categoria.service;

import com.dom.ms_categoria.entity.ProductoCategoria;

import java.util.List;

public interface IProductoCategoriaService {
    List<ProductoCategoria> obtenerPorProducto(Long codigoProducto);
    ProductoCategoria asignarCategoria(ProductoCategoria pc);
    void eliminarAsignacion(Long codigoProducto, Long codigoCategoria);
}
