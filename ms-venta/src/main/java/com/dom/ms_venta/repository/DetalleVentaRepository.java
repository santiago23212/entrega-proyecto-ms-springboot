package com.dom.ms_venta.repository;

import com.dom.ms_venta.entity.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {
    @Query("SELECT dv.codigoProducto FROM DetalleVenta dv JOIN Venta v ON dv.codigoVenta = v.codigoVenta GROUP BY dv.codigoProducto HAVING MAX(v.fechaVenta) < :fechaLimite")
    List<Long> findProductosSinVentasDesde(@Param("fechaLimite") LocalDate fechaLimite);
}
