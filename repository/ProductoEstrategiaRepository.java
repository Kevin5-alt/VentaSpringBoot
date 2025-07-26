/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.ProductoEstrategia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Representa la relación N–N entre Producto y Estrategia de internacionalización.
 */
public interface ProductoEstrategiaRepository extends JpaRepository<ProductoEstrategia, Integer> {

    /**
     * Lista asociaciones por estrategia.
     */
    List<ProductoEstrategia> findByEstrategiaId(Integer estrategiaId);
}

