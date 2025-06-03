package com.dom.ms_empleado.controller;

import com.dom.ms_empleado.dto.EmpleadoDTO;
import com.dom.ms_empleado.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private IEmpleadoService empleadoService;

    @GetMapping
    public List<EmpleadoDTO> listarTodos() {
        return empleadoService.obtenerTodos();
    }

    @GetMapping("/{doc}")
    public EmpleadoDTO obtenerPorDocumento(@PathVariable("doc") Long doc) {
        return empleadoService.obtenerPorDocumento(doc);
    }

    @PostMapping
    public EmpleadoDTO crear(@RequestBody EmpleadoDTO dto) {
        return empleadoService.crearEmpleado(dto);
    }
}
