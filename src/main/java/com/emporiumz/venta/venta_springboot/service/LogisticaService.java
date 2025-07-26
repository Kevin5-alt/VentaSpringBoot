/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.Logistica;
import java.util.List;

/**
 * CRUD para la entidad Logistica.
 */
public interface LogisticaService {
    Logistica crear(Logistica l);
    List<Logistica> listar();
    Logistica actualizar(Logistica l);
    void eliminar(Integer id);
}

