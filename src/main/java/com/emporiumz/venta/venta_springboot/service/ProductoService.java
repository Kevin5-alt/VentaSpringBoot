/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.Producto;
import java.util.List;

/**
 * CRUD para la entidad Producto.
 */
public interface ProductoService {
    Producto crear(Producto prod);
    List<Producto> listar();
    Producto actualizar(Producto prod);
    void eliminar(Integer id);
}

