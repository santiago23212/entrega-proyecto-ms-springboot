package com.dom.ms_producto.controller;

import com.dom.ms_producto.dto.ProductoDTO;
import com.dom.ms_producto.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping
    public List<ProductoDTO> listarTodos() {
        return productoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public ProductoDTO obtenerPorId(@PathVariable("id") Long id) {
        return productoService.obtenerPorId(id);
    }

    @PostMapping
    public ProductoDTO crear(@RequestBody ProductoDTO dto) {
        return productoService.crearProducto(dto);
    }
}
