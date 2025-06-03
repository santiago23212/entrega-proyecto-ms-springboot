package com.dom.ms_venta.feign;
import com.dom.ms_venta.dto.ProductoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "ms-producto", url = "http://localhost:8080")
public interface ProductoFeignClient {
    @GetMapping("/api/productos/{id}")
    ProductoDTO getProductoById(@PathVariable("id") Long id);
}
