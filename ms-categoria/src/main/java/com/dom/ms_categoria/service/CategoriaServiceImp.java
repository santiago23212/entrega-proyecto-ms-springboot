package com.dom.ms_categoria.service;

import com.dom.ms_categoria.dto.CategoriaDTO;
import com.dom.ms_categoria.entity.Categoria;
import com.dom.ms_categoria.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriaServiceImp implements ICategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaDTO> obtenerTodas() {
        return categoriaRepository.findAll().stream().map(c -> {
            CategoriaDTO dto = new CategoriaDTO();
            dto.setCodigoCategoria(c.getCodigoCategoria());
            dto.setNombreCategoria(c.getNombreCategoria());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public CategoriaDTO obtenerPorId(Long id) {
        Categoria c = categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
        CategoriaDTO dto = new CategoriaDTO();
        dto.setCodigoCategoria(c.getCodigoCategoria());
        dto.setNombreCategoria(c.getNombreCategoria());
        return dto;
    }

    @Override
    public CategoriaDTO crearCategoria(CategoriaDTO dto) {
        Categoria c = new Categoria();
        c.setNombreCategoria(dto.getNombreCategoria());
        Categoria guardada = categoriaRepository.save(c);
        CategoriaDTO respuesta = new CategoriaDTO();
        respuesta.setCodigoCategoria(guardada.getCodigoCategoria());
        respuesta.setNombreCategoria(guardada.getNombreCategoria());
        return respuesta;
    }
}
