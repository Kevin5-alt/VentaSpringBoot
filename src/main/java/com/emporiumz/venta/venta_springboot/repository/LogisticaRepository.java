/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.Logistica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Permite rastrear y actualizar estados de envío por factura.
 */
public interface LogisticaRepository extends JpaRepository<Logistica, Integer> {

    /**
     * Lista envíos según su estado.
     * @param estado
     * @return 
     */
    List<Logistica> findByEstadoEnvio(String estado);

    /**
     * Obtiene la logística asociada a una factura.
     * @param facturaId
     * @return 
     */
    List<Logistica> findByFacturaId(Integer facturaId);
}

