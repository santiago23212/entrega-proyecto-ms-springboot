package com.dom.ms_categoria.controller;

import com.dom.ms_categoria.entity.ProductoCategoria;
import com.dom.ms_categoria.service.IProductoCategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto-categoria")
public class ProductoCategoriaController {

    @Autowired
    private IProductoCategoriaService productoCategoriaService;

    @GetMapping("/producto/{codProd}")
    public List<ProductoCategoria> obtenerPorProducto(@PathVariable("codProd") Long codProd) {
        return productoCategoriaService.obtenerPorProducto(codProd);
    }

    @PostMapping
    public ProductoCategoria asignar(@RequestBody ProductoCategoria pc) {
        return productoCategoriaService.asignarCategoria(pc);
    }

    @DeleteMapping("/{codProd}/{codCat}")
    public void eliminar(@PathVariable("codProd") Long codProd,
                         @PathVariable("codCat") Long codCat) {
        productoCategoriaService.eliminarAsignacion(codProd, codCat);
    }
}
