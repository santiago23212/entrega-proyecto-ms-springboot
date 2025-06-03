package com.dom.ms_categoria.controller;

import com.dom.ms_categoria.dto.CategoriaDTO;
import com.dom.ms_categoria.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping
    public List<CategoriaDTO> listarTodas() {
        return categoriaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public CategoriaDTO obtenerPorId(@PathVariable("id") Long id) {
        return categoriaService.obtenerPorId(id);
    }

    @PostMapping
    public CategoriaDTO crear(@RequestBody CategoriaDTO dto) {
        return categoriaService.crearCategoria(dto);
    }
}
