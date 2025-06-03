package com.dom.ms_categoria.service;

import com.dom.ms_categoria.dto.CategoriaDTO;

import java.util.List;

public interface ICategoriaService {
    List<CategoriaDTO> obtenerTodas();
    CategoriaDTO obtenerPorId(Long id);
    CategoriaDTO crearCategoria(CategoriaDTO dto);
}
