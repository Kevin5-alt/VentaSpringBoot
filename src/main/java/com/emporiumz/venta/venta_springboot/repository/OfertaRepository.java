/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.Oferta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Gestiona promociones, porcentaje de descuento y periodos de vigencia de ofertas.
 */
public interface OfertaRepository extends JpaRepository<Oferta, Integer> {

    /**
     * Obtiene ofertas activas en la fecha dada.
     * @param fecha
     * @param fecha2
     * @return 
     */
    List<Oferta> findByFechaInicioBeforeAndFechaFinAfter(LocalDate fecha, LocalDate fecha2);
}


