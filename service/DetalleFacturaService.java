/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.DetalleFactura;
import java.util.List;

/**
 * CRUD para la entidad DetalleFactura.
 */
public interface DetalleFacturaService {
    DetalleFactura crear(DetalleFactura d);
    List<DetalleFactura> listar();
    DetalleFactura actualizar(DetalleFactura d);
    void eliminar(Integer id);
}

