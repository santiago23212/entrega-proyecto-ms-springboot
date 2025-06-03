package com.dom.ms_empleado.service;

import com.dom.ms_empleado.dto.EmpleadoDTO;
import com.dom.ms_empleado.entity.Empleado;
import com.dom.ms_empleado.repository.EmpleadoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Data
@Service
public class EmpleadoServiceImp implements IEmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<EmpleadoDTO> obtenerTodos() {
        return empleadoRepository.findAll()
            .stream()
            .map(e -> {
                EmpleadoDTO dto = new EmpleadoDTO();
                dto.setDocumentoEmpleado(e.getDocumentoEmpleado());
                dto.setNombreEmpleado(e.getNombreEmpleado());
                dto.setApellido1Empleado(e.getApellido1Empleado());
                dto.setApellido2Empleado(e.getApellido2Empleado());
                return dto;
            })
            .collect(Collectors.toList());
    }

    @Override
    public EmpleadoDTO obtenerPorDocumento(Long documento) {
        Empleado e = empleadoRepository.findById(documento)
            .orElseThrow(() -> new RuntimeException("Empleado no encontrado"));
        EmpleadoDTO dto = new EmpleadoDTO();
        dto.setDocumentoEmpleado(e.getDocumentoEmpleado());
        dto.setNombreEmpleado(e.getNombreEmpleado());
        dto.setApellido1Empleado(e.getApellido1Empleado());
        dto.setApellido2Empleado(e.getApellido2Empleado());
        return dto;
    }

    @Override
    public EmpleadoDTO crearEmpleado(EmpleadoDTO dto) {
        Empleado e = new Empleado();
        e.setDocumentoEmpleado(dto.getDocumentoEmpleado());
        e.setNombreEmpleado(dto.getNombreEmpleado());
        e.setApellido1Empleado(dto.getApellido1Empleado());
        e.setApellido2Empleado(dto.getApellido2Empleado());
        Empleado guardado = empleadoRepository.save(e);

        EmpleadoDTO respuesta = new EmpleadoDTO();
        respuesta.setDocumentoEmpleado(guardado.getDocumentoEmpleado());
        respuesta.setNombreEmpleado(guardado.getNombreEmpleado());
        respuesta.setApellido1Empleado(guardado.getApellido1Empleado());
        respuesta.setApellido2Empleado(guardado.getApellido2Empleado());
        return respuesta;
    }
}
