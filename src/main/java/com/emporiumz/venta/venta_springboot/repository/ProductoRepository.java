/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Incluye consultas derivadas automáticas sobre nombre, precio y stock de productos.
 */
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

    /**
     * Busca productos cuyo nombre contenga el texto indicado.
     * @param nombre
     * @return 
     */
    List<Producto> findByNombreProductoContaining(String nombre);

    /**
     * Recupera productos con precio entre mínimo y máximo.
     * @param min
     * @param max
     * @return 
     */
    List<Producto> findByPrecioUnitarioBetween(BigDecimal min, BigDecimal max);
}

