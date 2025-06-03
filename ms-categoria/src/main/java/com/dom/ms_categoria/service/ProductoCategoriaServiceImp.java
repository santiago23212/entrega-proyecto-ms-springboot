package com.dom.ms_categoria.service;

import com.dom.ms_categoria.entity.ProductoCategoria;
import com.dom.ms_categoria.entity.ProductoCategoriaId;
import com.dom.ms_categoria.repository.ProductoCategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoCategoriaServiceImp implements IProductoCategoriaService {

    @Autowired
    private ProductoCategoriaRepository productoCategoriaRepository;

    @Override
    public List<ProductoCategoria> obtenerPorProducto(Long codigoProducto) {
        return productoCategoriaRepository.findAll().stream()
            .filter(pc -> pc.getCodigoProducto().equals(codigoProducto))
            .toList();
    }

    @Override
    public ProductoCategoria asignarCategoria(ProductoCategoria pc) {
        return productoCategoriaRepository.save(pc);
    }

    @Override
    public void eliminarAsignacion(Long codigoProducto, Long codigoCategoria) {
        ProductoCategoriaId id = new ProductoCategoriaId(codigoProducto, codigoCategoria);
        productoCategoriaRepository.deleteById(id);
    }
}
