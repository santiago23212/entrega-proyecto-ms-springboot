package com.dom.ms_categoria.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "productos_categorias")
@IdClass(ProductoCategoriaId.class)
public class ProductoCategoria {

    @Id
    @Column(name = "codigo_producto")
    private Long codigoProducto;

    @Id
    @Column(name = "codigo_categoria")
    private Long codigoCategoria;

    // getters y setters
}
