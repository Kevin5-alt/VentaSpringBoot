/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emporiumz.venta.venta_springboot.service;

import com.emporiumz.venta.venta_springboot.domain.ProductoOferta;
import java.util.List;

/**
 * CRUD para la entidad ProductoOferta (join).
 */
public interface ProductoOfertaService {
    ProductoOferta crear(ProductoOferta po);
    List<ProductoOferta> listar();
    ProductoOferta actualizar(ProductoOferta po);
    void eliminar(Integer id);
}
