/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Controla existencias y movimientos de stock de productos.
 */
public interface InventarioRepository extends JpaRepository<Inventario, Integer> {

    /**
     * Recupera todos los registros de inventario de un producto.
     * @param productoId
     * @return 
     */
    List<Inventario> findByProductoId(Integer productoId);
}

