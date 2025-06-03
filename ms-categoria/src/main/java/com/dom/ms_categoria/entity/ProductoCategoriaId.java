package com.dom.ms_categoria.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class ProductoCategoriaId implements Serializable {

    private Long codigoProducto;
    private Long codigoCategoria;

    // Constructor vacío
    public ProductoCategoriaId() {}

    // Constructor con parámetros
    public ProductoCategoriaId(Long codigoProducto, Long codigoCategoria) {
        this.codigoProducto = codigoProducto;
        this.codigoCategoria = codigoCategoria;
    }

    // equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoCategoriaId)) return false;
        ProductoCategoriaId that = (ProductoCategoriaId) o;
        return Objects.equals(getCodigoProducto(), that.getCodigoProducto()) &&
               Objects.equals(getCodigoCategoria(), that.getCodigoCategoria());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoProducto(), getCodigoCategoria());
    }

    // getters y setters
}
