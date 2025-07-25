/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.ProductoOferta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Representa la relación N–N entre Producto y Oferta.
 */
public interface ProductoOfertaRepository extends JpaRepository<ProductoOferta, Integer> {

    /**
     * Recupera todas las ofertas asociadas a un producto.
     * @param productoId
     * @return 
     */
    List<ProductoOferta> findByProductoId(Integer productoId);
}

