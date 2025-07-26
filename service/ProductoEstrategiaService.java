/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.ProductoEstrategia;
import java.util.List;

/**
 * CRUD para la entidad ProductoEstrategia (join).
 */
public interface ProductoEstrategiaService {
    ProductoEstrategia crear(ProductoEstrategia pe);
    List<ProductoEstrategia> listar();
    ProductoEstrategia actualizar(ProductoEstrategia pe);
    void eliminar(Integer id);
}

