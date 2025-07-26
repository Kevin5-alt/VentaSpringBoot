/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.Factura;
import java.util.List;

/**
 * CRUD para la entidad Factura.
 */
public interface FacturaService {
    Factura crear(Factura factura);
    List<Factura> listar();
    Factura actualizar(Factura factura);
    void eliminar(Integer id);
}
