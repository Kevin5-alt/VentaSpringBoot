/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.Oferta;
import java.util.List;

/**
 * CRUD para la entidad Oferta.
 */
public interface OfertaService {
    Oferta crear(Oferta oferta);
    List<Oferta> listar();
    Oferta actualizar(Oferta oferta);
    void eliminar(Integer id);
}

