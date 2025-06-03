package com.dom.ms_venta.repository;
import com.dom.ms_venta.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
