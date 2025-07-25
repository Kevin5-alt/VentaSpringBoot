/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.repository;

import com.emporiumz.venta.venta_springboot.domain.EstrategiaInternacionalizacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Maneja el CRUD de planes y objetivos de expansión global.
 */
public interface EstrategiaInternacionalizacionRepository
    extends JpaRepository<EstrategiaInternacionalizacion, Integer> {

    /**
     * Encuentra estrategias por país destino.
     * @param paisDestino
     * @return 
     */
    List<EstrategiaInternacionalizacion> findByPaisDestino(String paisDestino);
}
