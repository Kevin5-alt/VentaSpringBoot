/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.EstrategiaInternacionalizacion;
import java.util.List;

/**
 * CRUD para EstrategiaInternacionalizacion.
 */
public interface EstrategiaInternacionalizacionService {
    EstrategiaInternacionalizacion crear(EstrategiaInternacionalizacion e);
    List<EstrategiaInternacionalizacion> listar();
    EstrategiaInternacionalizacion actualizar(EstrategiaInternacionalizacion e);
    void eliminar(Integer id);
}

