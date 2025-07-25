/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Permite generar, consultar y filtrar facturas por usuario o fecha.
 */
public interface FacturaRepository extends JpaRepository<Factura, Integer> {

    /**
     * Encuentra facturas de un usuario.
     * @param usuarioId
     * @return 
     */
    List<Factura> findByUsuarioId(Integer usuarioId);

    /**
     * Encuentra facturas emitidas entre dos fechas.
     * @param inicio
     * @param fin
     * @return 
     */
    List<Factura> findByFechaFacturaBetween(LocalDateTime inicio, LocalDateTime fin);
}

