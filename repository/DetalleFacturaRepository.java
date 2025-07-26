/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Gestiona el detalle de productos asociados a cada factura.
 */
public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Integer> {

    /**
     * Recupera la lista de detalles de una factura.
     * @param facturaId
     * @return 
     */
    List<DetalleFactura> findByFacturaId(Integer facturaId);
}

