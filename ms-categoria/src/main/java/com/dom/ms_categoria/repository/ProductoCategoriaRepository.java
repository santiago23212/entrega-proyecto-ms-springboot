package com.dom.ms_categoria.repository;

import com.dom.ms_categoria.entity.ProductoCategoria;
import com.dom.ms_categoria.entity.ProductoCategoriaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoCategoriaRepository extends JpaRepository<ProductoCategoria, ProductoCategoriaId> {
}
