package com.dom.ms_categoria.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categorias")
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_categoria", nullable = false)
    private Long codigoCategoria;

    @Column(name = "nombre_categoria")
    private String nombreCategoria;

    // getters y setters
}
