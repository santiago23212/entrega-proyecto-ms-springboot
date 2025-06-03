package com.dom.ms_empleado.service;

import com.dom.ms_empleado.dto.EmpleadoDTO;

import java.util.List;

public interface IEmpleadoService {
    List<EmpleadoDTO> obtenerTodos();
    EmpleadoDTO obtenerPorDocumento(Long documento);
    EmpleadoDTO crearEmpleado(EmpleadoDTO dto);
}
